package de.galileocomputing.schroedinger.java.kapitel07.AbstrakteKlassenUndInterfaces.Tontraeger;

public abstract class Tontraeger {

	String titel;

	public Tontraeger(String titel) {
		super();
		this.titel = titel;
	}

	public String getTitel() {
		return titel;
	}
	
}
