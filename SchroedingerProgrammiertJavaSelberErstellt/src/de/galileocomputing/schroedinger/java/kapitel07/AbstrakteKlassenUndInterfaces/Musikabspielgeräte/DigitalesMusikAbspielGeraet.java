package de.galileocomputing.schroedinger.java.kapitel07.AbstrakteKlassenUndInterfaces.Musikabspielger�te;

import de.galileocomputing.schroedinger.java.kapitel07.AbstrakteKlassenUndInterfaces.Tontraeger.Tontraeger;

public abstract class DigitalesMusikAbspielGeraet extends Musikabspielgeraet{

	@Override
	public void abspielen(Tontraeger tontraeger) {
		System.out.println("Man merkt das " + tontraeger.getTitel()+"diesmal digital ist, klingt kacke");
	}
}
