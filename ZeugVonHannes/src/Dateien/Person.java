package Dateien;

import java.io.Serializable;
import java.util.*;

public class Person implements Serializable  {
	private static final long uid = 123456789;
	private String vorname;
	private String nachname;
	private String geburtsdatum;
	private Map<String, String> telnr = new TreeMap<String, String>();
	public Person(String vorname, String nachname, String geburtsdatum)
	{
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsdatum = geburtsdatum;
	}
	
	

	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getGeburtsdatum() {
		return geburtsdatum;
	}
	public void setGeburtsdatum(String geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}
	public void setTelnr(String type, String telnr) {
		this.telnr.put(type, telnr);
	}
	public String getTelnr(String type) {
		return this.telnr.get(type);
	}
	public boolean delTelnr(String type) {
		if (this.telnr.containsKey(type) == true) {
			this.telnr.remove(type);
			return true;
		} else {
			return false;
		}
	}
	public String toString()
	{
		return vorname + " " + nachname + " " + geburtsdatum + this.telnr.toString();
	}
	
	
	
	




}
	


