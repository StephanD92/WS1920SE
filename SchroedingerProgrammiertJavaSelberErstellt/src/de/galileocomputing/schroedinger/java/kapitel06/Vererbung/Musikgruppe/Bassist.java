package de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Musikgruppe;

public class Bassist extends Musiker {

	public Bassist(String name, String vorname, int alter, String kuenstlername) {
		super(name, vorname, alter, kuenstlername);
		
	}

	public void musizieren() {
		System.out.println("blümblümblümböööm");
	}
	
}
