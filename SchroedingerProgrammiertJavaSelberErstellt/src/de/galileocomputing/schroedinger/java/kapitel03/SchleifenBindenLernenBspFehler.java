package de.galileocomputing.schroedinger.java.kapitel03;

public class SchleifenBindenLernenBspFehler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//zahlen 1-10 in umgekehrter Reihenfolge ausgeben
		
		for(int i=10;i>0;i--) {
			System.out.println(i);
		}
		
		/*
		Beispiel Fehler: Die innere Schleife zählt die Variable der äußeren hoch und nicht die eigene.
		Somit kommt sie nie zu einem Ende. Endlosschleife. Ändert man das i in der zweiten Schleife zu einem
		j dann passt es wieder
		
		 for (int i=1;i<=10;i++) {
			for(int j=1;j<=10;i++) {
				System.out.println(i+ ", " + j);
			}
		}
		*/
	}

}
