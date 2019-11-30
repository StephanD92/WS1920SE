package de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Musikgruppe;

public class Saenger extends Musiker {

	
	public Saenger(String name, String vorname, int alter, String kuenstlername) {
		super(name, vorname, alter, kuenstlername);
	}

	@Override
	public void musizieren() {
		System.out.println("wo bisch du maaain Soooooonnnnenlischt??");
	}
	
}
