package de.galileocomputing.schroedinger.java.kapitel03;

import de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Musikgruppe.EAM;

public class SwitchAnweisungNotenausgabeMitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Aufgabe Seite 110
		System.out.println("bitte note eingeben");
		args[0] = EAM.rString();
		String note = args[0];
		//System.out.println("eingabe: "+args[0]);   // nur ein TEst
		// alternativ wie immer String in Starparameter über run configuration übergeben, dann
		// würde man starten mit String note = args[0];
		switch(note.toLowerCase()) {   //eingegebener Wert wird klein gemacht!
			case "sehr gut":	System.out.println(1); break;
			case "gut":			System.out.println(2); break;
			case "befriedigend":System.out.println(3); break;
			case "ausreichend":	System.out.println(4); break;
			case "mangelhaft":	System.out.println(5); break;
			case "ungenügend":	System.out.println(6); break;
			default: System.out.println("Ungültiger Wert");
		}
		
		
	}

}
