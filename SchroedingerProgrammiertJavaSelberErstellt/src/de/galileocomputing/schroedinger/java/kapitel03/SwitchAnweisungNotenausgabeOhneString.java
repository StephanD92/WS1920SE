package de.galileocomputing.schroedinger.java.kapitel03;

import de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Musikgruppe.EAM;

public class SwitchAnweisungNotenausgabeOhneString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	// Aufgabe seite 109	
	System.out.println("bitte note eingeben:");
	int note = EAM.rInt(); // alternativ kann man auch note als Starparameter übergeben
	// int note = Integer.parseInt(args[0]);
	
	if (note >=1 && note <=6) {  // es wird vorher geprüft ob zahl im gewollten bereich liegt. somit werden
		// bei falschem wert garnicht erst alle cases durchgegangen. Wenn viele ungültige 
		switch (note) {
		case 1:System.out.println("Sehr gut"); break;
		case 2:System.out.println("gut"); break;
		case 3:System.out.println("befriedigend"); break;
		case 4:System.out.println("ausreichend"); break;
		case 5:System.out.println("mangelhaft"); break;
		case 6:System.out.println("ungenügend"); break;
		//default:System.out.println("bitte Note als zahl (1-6) eingeben"); 
		// wenn ungültiger wert eingegeben wird er trotzdem mit allen cases verglichen (kann dauern)
		// wenn man denkt es werden viele ungültige werte eingegeben gibt es eine bessere lösung (if else)
		}
	}
	else {
		System.out.println("ungültiger wert: bitte note als ganzzahl (1-6) eingeben");
	}
	}

}
