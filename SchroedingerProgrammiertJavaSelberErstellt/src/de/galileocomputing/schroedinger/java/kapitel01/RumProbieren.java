package de.galileocomputing.schroedinger.java.kapitel01;

public class RumProbieren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ordne die nummerierten Zeilen so an das die Zaheln 8,8,81,81,9,9,7,7 in genau dieser
		// Reihenfolge ausgegeben werden
		
		int zahl = 7;
		
		/*
		System.out.println(zahl*zahl);
		System.out.println(zahl++);
		System.out.println(++zahl);
		System.out.println(zahl = zahl*zahl);
		System.out.println(--zahl);
		System.out.println(zahl--);
		System.out.println(zahl =(zahl-9)/8);
		System.out.println(zahl);
		*/
		//erst ausgabe vor der Lösung: 49,7,9,81,80,80,8,8
		
		// Lösung
		System.out.println(++zahl);
		System.out.println(zahl++);
		System.out.println(zahl*zahl);
		System.out.println(zahl = zahl*zahl);
		System.out.println(zahl =(zahl-9)/8);
		System.out.println(zahl--);
		System.out.println(--zahl);
		System.out.println(zahl);
		
		System.out.println();
		System.out.println(zahl*zahl); // rechnung wird direkt ausgegeben ohne das man variable brauch
	}

}
