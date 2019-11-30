package de.galileocomputing.schroedinger.java.kapitel07.AbstrakteKlassenUndInterfaces.Musikabspielgeräte;

import de.galileocomputing.schroedinger.java.kapitel07.AbstrakteKlassenUndInterfaces.Tontraeger.Tontraeger;

public abstract class Musikabspielgeraet {

	private Tontraeger tontraeger;
	protected abstract boolean unterstuetztTontraeger(Tontraeger tontraeger);
	protected abstract void einlegen(Tontraeger tontraeger);
		
	protected abstract void abspielen(Tontraeger tontraeger);
	
	public final void hoeren(Tontraeger tontraeger) {
		if(this.unterstuetztTontraeger(tontraeger)) {
			this.tontraeger = tontraeger;
			this.einlegen(tontraeger);
			this.abspielen(tontraeger);
		} else {
			System.err.println(this.getClass().getSimpleName()+ " unterstuetzt " + 
				tontraeger.getClass().getSimpleName() + "nicht.");
		}
	}
	
	public Tontraeger auswerfen() {
		Tontraeger tontreaeger = this.tontraeger;
		this.tontraeger = null;
		return tontraeger;
	}
	
	
	
	
	
	
	
	
	
	
	
//	private String name;
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public String getName() {
//		return this.name;
//	}
}
