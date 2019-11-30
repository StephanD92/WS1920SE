package de.galileocomputing.schroedinger.java.kapitel07.AbstrakteKlassenUndInterfaces.Musikabspielgeräte;

import de.galileocomputing.schroedinger.java.kapitel07.AbstrakteKlassenUndInterfaces.Tontraeger.Tontraeger;

public abstract class AnalogesMusikAbspielGeraet extends Musikabspielgeraet{

	@Override
	public void abspielen(Tontraeger tontraeger) {
		System.out.println("der Titel "+tontraeger.getTitel()+" klingt analog echt viel geiler");
	}
}
