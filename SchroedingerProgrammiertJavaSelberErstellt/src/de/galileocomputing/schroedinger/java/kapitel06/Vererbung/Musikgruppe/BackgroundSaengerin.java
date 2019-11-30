package de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Musikgruppe;

public class BackgroundSaengerin extends Saenger {

	public BackgroundSaengerin(String name, String vorname, int alter, String kuenstlername) {
		super(name, vorname, alter, kuenstlername);
		
	}

	public void musizieren() {
		System.out.println("UUUUhhhhAAAOOOOHHHAAA");
	}
}
