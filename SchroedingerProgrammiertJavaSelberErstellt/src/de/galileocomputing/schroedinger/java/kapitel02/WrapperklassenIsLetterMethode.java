package de.galileocomputing.schroedinger.java.kapitel02;

import de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Musikgruppe.EAM;

public class WrapperklassenIsLetterMethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Aufgabe: Schreibe ein Programm, das für ein Char ausgibt, ob es ein Buschstabe ist
//		und ob es ein Groß- und Kleinbuchstabe ist
		
		
		System.out.println("bitte geben Sie ein Zeichen ein:");
		char zeichen = EAM.rChar();
		
		System.out.println("Buchstabe: "+ Character.isLetter(zeichen)); //prüft ob es buchstabe ist
		System.out.println("Großbuchstabe: "+ Character.isUpperCase(zeichen)); // prüft ob es großbuchstabe ist
		
	}

}
