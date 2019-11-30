package de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Musikgruppe;

public class Kuenstler extends Person {

	private String kuenstlername;
	
	public Kuenstler(String name, String vorname, int alter, String kuenstlername) {
		super(name,vorname,alter);
		this.kuenstlername = kuenstlername;
	}

	public String getKuenstlername() {
		return kuenstlername;
	}

	public void setKuenstlername(String kuenstlername) {
		this.kuenstlername = kuenstlername;
	}
	
	
}
