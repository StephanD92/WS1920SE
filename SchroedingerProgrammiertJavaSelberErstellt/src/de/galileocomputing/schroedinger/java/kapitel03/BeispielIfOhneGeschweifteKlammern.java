package de.galileocomputing.schroedinger.java.kapitel03;

import de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Musikgruppe.EAM;

public class BeispielIfOhneGeschweifteKlammern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fuellhoeheML = 250;
		
		if (fuellhoeheML >0 && fuellhoeheML <=250) 
			if (fuellhoeheML == 125) 
			System.out.println("Das Glas ist halb voll");
			else 
			System.out.println("Das Glas ist leer");
		
		// obwohl der wert bei 250 liegt ist die Ausgabe das Glas ist leer 
			
			
		
		
	}

}
