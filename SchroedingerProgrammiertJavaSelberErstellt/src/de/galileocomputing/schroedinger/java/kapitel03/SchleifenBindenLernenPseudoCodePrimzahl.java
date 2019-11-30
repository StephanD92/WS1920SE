package de.galileocomputing.schroedinger.java.kapitel03;

public class SchleifenBindenLernenPseudoCodePrimzahl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Seite 119 im Buch. Es kann hilfreich sein Pseudo Code zu erstellen, indem man beschreibt 
		was die Schleife machen soll.
		Beispiel:
		
		Betrachte alle Zahlen i von 1 bis 100
			Annamhe: i ist Primzahl
			Betrachte alle Zahlen j von 2 bis i-1
				Wenn i durch j geteilt werden kann
					i ist doch keine Primzahl, und dei Teilersuche kann abgebrochen werden
					
		*/
		// Betrachte alle Zahlen i von 1 bis 100
		for (int i=1; i<=100; i++) {
			//Annahme i ist primzahl
			boolean istPrimzahl = true;
			// Betrachte alle Zahlen b von 2 bis i-1,
			// b<i wäre vom aufwand her größer
			for (int b=2; b<i; b++) {
				// Wenn i durch j geteilt werden kann
				if (i%b == 0) {
					// i ist doch keine Primzahl
					istPrimzahl = false;
					// und die Teilersuche kann abgebrochen werden
					break;
				}
			}
			if (istPrimzahl) {
				System.out.println(i);
			}
		}
		
//		Mangel: Rechenaufwand ist hoch weil zahl durch alle zeilen geteilt werden die Kleiner sind als Zahl
//		Es ist aber möglich das zu vereinfachen. Man kann z.B. b*b<i nehmen und spart dadurch rechenschritte
//		
		
	}

}
