package de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Musikgruppe;

public class Musiker extends Kuenstler {

	
	private Band band;
	
	public Musiker(String name,String vorname, int alter, String kuenstlername) {
		super(name,vorname,alter,kuenstlername);
	}
	
	
	public Band getBand() {
		return band;
	}
	public void setBand(Band band) {
		this.band = band;
	}


	
	public void musizieren() {
		System.out.println("ringRIngRingdämdämdäm");
	}

}
