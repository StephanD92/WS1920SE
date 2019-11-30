package de.galileocomputing.schroedinger.java.kapitel03;

import de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Musikgruppe.EAM;

public class SwitchVsIfElseWoWUniversum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Aufgabe Seite 111
//		Schreibe ein Programm, das ausgibt, wie stark du deinen Gegner getroffen
//		hast. 0 bedeutet, du hast ihn gar nicht getroffen, 1-3 bedeutet schwach getroffen, 
//		4-7 normal getroffen und 8-10 kritisch
		
		
		int treffer = EAM.rInt();
		
		//funktionert aber wird irgendwann unübersichtlich und ist schlecht anpassbar bei
//		änderungen. Stellen wir uns vor die Regeln ändern sich und plötzlich sind die Zahlen
//		ganz anders.anders z.B. gehts nicht mehr bis 10 sondern bis 40. Dann haben wir den Salat 
//		Switch kann NICHT mit booleschen Ausdrücken arbeiten
//		wenn man mit Wahrheitswerten arbeiten kann lieber if else nehmen wie folgt:
		switch(treffer) {
			case 0: System.out.println("garnicht getroffen"); break;
			case 1:
			case 2:
			case 3: System.out.println("schwach getroffen"); break;
			case 4:
			case 5:
			case 6:
			case 7: System.out.println("normal getroffen"); break;
			case 8:
			case 9:
			case 10: System.out.println("kritisch"); break;
			default: System.out.println("bitte richtigen Wert eingeben");
		}
		
		
		// bessere Lösung: wenn man einzelne Fälle besser mit Booleschen Ausdrücken beschreiben kann
		// nimmt man eher ein if else
		if(treffer >=30) {
			System.out.println("kritischer Treffer");
		} else if(treffer >=16) {
			System.out.println("normaler Treffer");
		} else if (treffer >0) {
			System.out.println("schwacher Treffer");
		} else {
			System.out.println("kritsch");
		}
		
	}

}
