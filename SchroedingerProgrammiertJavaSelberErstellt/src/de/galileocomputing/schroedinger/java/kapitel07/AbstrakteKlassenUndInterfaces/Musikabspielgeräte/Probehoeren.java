package de.galileocomputing.schroedinger.java.kapitel07.AbstrakteKlassenUndInterfaces.Musikabspielger�te;

import de.galileocomputing.schroedinger.java.kapitel07.AbstrakteKlassenUndInterfaces.Musikabspielger�te.*;
import de.galileocomputing.schroedinger.java.kapitel07.AbstrakteKlassenUndInterfaces.Tontraeger.*;

public class Probehoeren {

	public static void main(String[] args) {
		
		Musikabspielgeraet kassettenRekorder = new Kassettenrekorder();
		kassettenRekorder.hoeren(new Kassette("Jimi Hendrix"));

	}

}
