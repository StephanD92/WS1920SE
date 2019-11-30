package de.galileocomputing.schroedinger.java.kapitel02;

public class BooleanOperatorenUndAufgabenMitFormulierung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b = true;
		boolean c = false;
		
		// die vier wichtigen Operatoren
		boolean ergebnis = !b;   //negation also NICHT b, somit wird gewechselt von true zu false
		ergebnis = b & c;		// UND liefert true wenn beide true sind. sind sie aber nicht, somit false
		ergebnis = b | c;			// ODER, wenn einer von beiden true ist, liefert ODER ein true. somit hier true
		ergebnis = b ^ c;		//xOR also exklusives oder, wenn nur einer true ist, wird true ausgegeben
		
		// für & und | gibt es noch die Schreibweise && und ||. Hier wird quasi bei && schon abgebrochen weiter
		// zu machen wenn der erste wert false ist. Macht ja auch sinn. Beispiele:
		
		boolean d = true;
		boolean e = false;
		
		ergebnis = e && d; // && bricht ab sobald ein wert false ist. da e false ist bricht er gleich ab und man spart zeit
		ergebnis = d || e; // bricht wieder ab weil d true ist und ein true reicht für true.
		System.out.println(ergebnis);
		// Empfehlung am besten immer && statt & und || statt | benutzen. außer man will Bit-Operationen durchführen
		// man nennt & und | auch bitweise operatoren
		
		
		
		
		
		// arbeiten mit Boolean: Ausformulieren eines Satzen und gleich auch programmieren
		int alter = 18;
		boolean volljaehrig = alter >=18;
		// Formulierung: AB 18 jahren ist man volljährig
		
		int uhrzeit = 14;
		boolean mussArbeiten = uhrzeit >= 9 && uhrzeit <=18;
		// Formulierung: zwischen 9 und 18 uhr muss ich arbeiten
		System.out.println(mussArbeiten);
		
		int geldDabei = 50;
		int schuhpreis = 50;
		boolean mussSchuheKaufen = geldDabei >= schuhpreis;
		// wenn ich genug geld für die schuhe dabei hab muss ich blechen
		System.out.println(mussSchuheKaufen);
		
		int anzBier = 2;
		boolean bierkaufen = anzBier <=2;
		System.out.println(bierkaufen);
		// wenn nur noch 2 bier oder weniger im Kühlschrank sind gehe ich bier kaufen
		
		boolean istFeiertag = true;
		boolean istWochenende = true;
		boolean findsPrima = istFeiertag && !istWochenende;
		System.out.println(findsPrima);
		// wenn es Feiertag ist und kein Wochenende find ich es prima!!
		
		boolean istFeiertag1 = true;
		boolean istWochenende1 = true;
		boolean findsWiederPrima = istFeiertag1 ^ istWochenende1;
		System.out.println(findsWiederPrima);
		// wenn es feiertag ODER wochenende ist find ich es wieder prima. (beides gleichzeitig wäre doof)
		
		boolean genugGeldaufKonto = false;
		boolean KontokarteDabei = true;
		boolean genugGeldDabei = false;
		boolean schuheKaufen = genugGeldDabei || (KontokarteDabei && genugGeldaufKonto);
		System.out.println(schuheKaufen);
		// wenn ich genug geld dabei habe ODER (meine Karte dabei hab UND genug geld drauf) kaufe ich neue Schuhe
		
		int BargeldDabei = 249;
		int KontoStandKarte = 260;
		int KaufpreisSchuhe = 249;
		boolean KarteDabei = false;
		boolean nochmalSchuheKaufen = BargeldDabei >= KaufpreisSchuhe || (KarteDabei && KaufpreisSchuhe <= KontoStandKarte);
		System.out.println(nochmalSchuheKaufen);
		// wenn ich genug bargeld für die schuhe kaufe ich sie oder wenn ich meine Karte dabei habe und genug geld drauf ist
	}

}
