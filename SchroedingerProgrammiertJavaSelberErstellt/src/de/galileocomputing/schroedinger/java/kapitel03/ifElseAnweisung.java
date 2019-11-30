package de.galileocomputing.schroedinger.java.kapitel03;

import de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Musikgruppe.EAM;

public class ifElseAnweisung  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// gibt es nur 2 Fälle reicht einfaches if. Aber mehr als 2 nimmt man else if
		
		
		System.out.println("bitte Füllmenge eingeben");
		int fuellmengeGlas = EAM.rInt();
		
		if (fuellmengeGlas <= 250) {
		
			if(fuellmengeGlas == 250) {
				System.out.println("Das Glas ist voll");
			}	
				else if( fuellmengeGlas < 250 && fuellmengeGlas >=125)   {
				System.out.println("Das glas ist mindestens halb voll");
				}	
				else if( fuellmengeGlas <125 &&  fuellmengeGlas >=90) {
				System.out.println("Das glas ist weniger als halb voll");
				}
				else if (fuellmengeGlas <90 && fuellmengeGlas >=1) {
					System.out.println("Scheiße nur noch weniger als 90");
				}
				else if (fuellmengeGlas == 0 ) {
				System.out.println("Das glas ist leer, Kellner!!!!");
				}
		}
		
			else {
			System.out.println("bitte nicht mehr als 250 eingeben du Mongo");
			}
	}

}
