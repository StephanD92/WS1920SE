package de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Musikgruppe;

public class Person extends Object{

	private String name;
	private String vorname;
	private int alter;
	
	public Person(String name, String vorname, int alter) {
		this.name = name;
		this.vorname = vorname;
		this.alter = alter;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	
}
