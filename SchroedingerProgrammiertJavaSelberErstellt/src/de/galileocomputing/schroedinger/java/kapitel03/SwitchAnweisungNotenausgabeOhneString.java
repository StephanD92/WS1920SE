package de.galileocomputing.schroedinger.java.kapitel03;

import de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Musikgruppe.EAM;

public class SwitchAnweisungNotenausgabeOhneString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	// Aufgabe seite 109	
	System.out.println("bitte note eingeben:");
	int note = EAM.rInt(); // alternativ kann man auch note als Starparameter �bergeben
	// int note = Integer.parseInt(args[0]);
	
	if (note >=1 && note <=6) {  // es wird vorher gepr�ft ob zahl im gewollten bereich liegt. somit werden
		// bei falschem wert garnicht erst alle cases durchgegangen. Wenn viele ung�ltige 
		switch (note) {
		case 1:System.out.println("Sehr gut"); break;
		case 2:System.out.println("gut"); break;
		case 3:System.out.println("befriedigend"); break;
		case 4:System.out.println("ausreichend"); break;
		case 5:System.out.println("mangelhaft"); break;
		case 6:System.out.println("ungen�gend"); break;
		//default:System.out.println("bitte Note als zahl (1-6) eingeben"); 
		// wenn ung�ltiger wert eingegeben wird er trotzdem mit allen cases verglichen (kann dauern)
		// wenn man denkt es werden viele ung�ltige werte eingegeben gibt es eine bessere l�sung (if else)
		}
	}
	else {
		System.out.println("ung�ltiger wert: bitte note als ganzzahl (1-6) eingeben");
	}
	}

}
