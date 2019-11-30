package de.galileocomputing.schroedinger.java.kapitel07.AbstrakteKlassenUndInterfaces.Musikabspielgeräte;

import de.galileocomputing.schroedinger.java.kapitel07.AbstrakteKlassenUndInterfaces.Tontraeger.Kassette;
import de.galileocomputing.schroedinger.java.kapitel07.AbstrakteKlassenUndInterfaces.Tontraeger.Tontraeger;


public class Kassettenrekorder extends AnalogesMusikAbspielGeraet {

	@Override
	protected boolean unterstuetztTontraeger (Tontraeger tontraeger) {
		return tontraeger instanceof Kassette;
	}
	
	@Override
	public void einlegen(Tontraeger tontraeger) {
		System.out.println("Reinschieben und hoffen das er das ding richtig nimmmt");
	}
	
	@Override
	public void abspielen(Tontraeger tontraeger) {
		super.abspielen(tontraeger);
		System.out.println("Mist schon wieder Werbung - vorspulen nervt doch");
	}
	
	@Override
	public Kassette auswerfen() {
		return (Kassette) super.auswerfen();
	}
		
	
}
