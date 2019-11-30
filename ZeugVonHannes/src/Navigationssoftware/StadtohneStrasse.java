package Navigationssoftware;

import java.util.*;

public class StadtohneStrasse {
	private String name;
	private HashMap<StadtohneStrasse, Integer> verbindungen = new HashMap<StadtohneStrasse, Integer>();
	public StadtohneStrasse(String name) {
		this.name = name;
	}
	public void addVerbindung(StadtohneStrasse s, int laenge) {
		this.verbindungen.put(s, laenge);
	}
	public int getLaenge (StadtohneStrasse s) {
		return verbindungen.get(s);
	}
	public String routeBerechnen(StadtohneStrasse ziel) {
		for (StadtohneStrasse s: verbindungen.keySet()) {
			if (s==ziel) {
				return "Route: " + this.name + " --> " + s.name + s.getLaenge(s);
			}
			
		}
		return "Keine Route gefunden";
	}
	
}
