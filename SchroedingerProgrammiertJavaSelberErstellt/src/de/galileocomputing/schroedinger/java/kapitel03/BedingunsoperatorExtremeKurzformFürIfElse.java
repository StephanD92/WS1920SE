package de.galileocomputing.schroedinger.java.kapitel03;

import de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Musikgruppe.EAM;

public class BedingunsoperatorExtremeKurzformF�rIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("bitte F�llh�he eingeben");
		int fuellhoeheinML = EAM.rInt();
		
		String nachricht = (fuellhoeheinML == 125) // boolescher Ausdruck
				? "Das Glas is halb voll."     // wird ausgegeben wenn bedingung erf�llt ist(fuellhoeheinML == 125)
				: "Das Glas ist nicht halb voll";  // wird ausgegeben wenn bedinung nicht erf�llt ist
		// System.out.println(nachricht);
		
		// kann auch direkt einer Methode �bergeben werden. z.B. der println Methode
		// geht nur mit 2 m�glichkeiten/bedingungen. Aber daf�r sehr sch�n elegant
		
		System.out.println((fuellhoeheinML == 125)
				? "Das Glas ist halb voll."
				: "Das Glas ist nicht halb voll");
		
		
	}

}
