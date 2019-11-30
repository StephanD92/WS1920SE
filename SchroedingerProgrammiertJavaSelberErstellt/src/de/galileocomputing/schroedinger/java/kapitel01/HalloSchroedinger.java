package de.galileocomputing.schroedinger.java.kapitel01;
import java.io.IOException;

import de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Musikgruppe.EAM;

public class HalloSchroedinger {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Hallo " + args[0]);
		// args ist ein Array von Strings und wir haben den Namen gespeichert unter
		// run - run configuration - arguments - program arguments
		System.out.println("Wie alt bist du?");
		
		int alter = EAM.rInt();
		System.out.println(args[0] + " ist " +alter+ " Jahre alt");
	}

}
