package de.galileocomputing.schroedinger.java.kapitel02;

public class Vergleichsoperatoren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean ergebnis = 6 < 7;
		
		ergebnis = 5 > 7;		// false
		ergebnis = 5 <= 5;		// true
		ergebnis = 5 >= 5;		//true
		ergebnis = 5 != 7;		//true, 5 ist nicht gleich 7. != bedeutet ungleich
		ergebnis = 5 == 7;		//false 5 und 7 sind nicht gleich
		
		
		System.out.println(ergebnis);
		
	}

}
