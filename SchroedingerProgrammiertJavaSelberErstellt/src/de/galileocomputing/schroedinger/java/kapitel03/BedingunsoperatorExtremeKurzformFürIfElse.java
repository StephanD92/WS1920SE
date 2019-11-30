package de.galileocomputing.schroedinger.java.kapitel03;

import de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Musikgruppe.EAM;

public class BedingunsoperatorExtremeKurzformFürIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("bitte Füllhöhe eingeben");
		int fuellhoeheinML = EAM.rInt();
		
		String nachricht = (fuellhoeheinML == 125) // boolescher Ausdruck
				? "Das Glas is halb voll."     // wird ausgegeben wenn bedingung erfüllt ist(fuellhoeheinML == 125)
				: "Das Glas ist nicht halb voll";  // wird ausgegeben wenn bedinung nicht erfüllt ist
		// System.out.println(nachricht);
		
		// kann auch direkt einer Methode übergeben werden. z.B. der println Methode
		// geht nur mit 2 möglichkeiten/bedingungen. Aber dafür sehr schön elegant
		
		System.out.println((fuellhoeheinML == 125)
				? "Das Glas ist halb voll."
				: "Das Glas ist nicht halb voll");
		
		
	}

}
