package de.galileocomputing.schroedinger.java.kapitel03;

public class BeispielFalscheIfAnweisungReihenfolge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fuellhoeheML = 125;
		
		if(fuellhoeheML == 250) {
			System.out.println("Das glas ist voll, geil");
		}
		else if(fuellhoeheML < 250) { // hier h�rt es leider schon auf, da die Bedingung erf�llt ist
			System.out.println("Das Glas ist nicht mehr voll");
		}
		else if(fuellhoeheML == 125) {
			System.out.println("Das Glas ist halb voll");
		}
		
		// Ausgabe: Das glas ist nicht mehr voll. Nachdem Beding <250 erf�llt ist geht er garnicht
	    // mehr weiter und somit ist der letzte else if DEAD CODE. Richtig:
		// die beiden letzten anweisungen vertauschen. speziellere F�lle immer vor den allgemeineren
		// ausf�hren lassen
	}

}
