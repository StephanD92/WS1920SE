package Kapitel53Schnittstellen;

public class Kaufhaus {

	public static void main(String[] args) {
		
//		Waren Klopapier = new Waren("Klopapier",1.99);
//		Klopapier.anzeigen();
//		System.out.println();
//		
//		Lebensmittel Schinken = new Lebensmittel("Schinken",3.00,40.6);
//		Schinken.anzeigen();
//		System.out.println();
//		
//		Spielwaren Spiel = new Spielwaren("Uno",12.99,12);
//		Spiel.anzeigen();
//		System.out.println("Die Steuer für Ware "+Spiel.beschreibung+" beträgt "+Spiel.berechneSteuer()+" Euro");
//		System.out.println();
//		
//		Buecher b1 = new Buecher("Bibel",15.99,"Gott");
//		b1.anzeigen();
//		System.out.println("Die Steuer für Ware "+b1.beschreibung+" beträgt " +b1.berechneSteuer()+" Euro");
		
		Waren[] inventar = new Waren[5];
//		inventar[0] = Klopapier; // kann man auch direkt reinschreiben wenn bereits vorhanden
//		inventar[1] = new Waren("Tube",5.99);
		inventar[2] = new Lebensmittel("Käse",2.49,5,10);
		inventar[3] = new Spielwaren("Siedler",14.99,4,12);
		inventar[4] = new Buecher("Koran",12.99,6,"Mohammed");
		
		Waren w3 = new Waren("Seife",1.99,10);
		w3.anzeigen();
		
//		for(int i=0; i<=inventar.length; i++){
//			
//			if(i == inventar.length) {
//				break;
//			}
//			else {
//				inventar[i].anzeigen();
//				System.out.println();
//			}
//		}
//		Skart1.berechneSteuer();
//		System.out.println("Die Steuer für Skart1 beträgt: "+Skart1.berechneSteuer()+" Euro");
		
		
		
		//Typumwandlung:
		
		
		Besteuerbar Skart1 = new Spielwaren("Skart",15.99,10,12); 
		// ist möglich aber man kann dann nur die Methoden des INterfaces aufrufen
		// die Methoden von Spielwaren oder Artikel (also anzeigen können nnicht aufgerufen werden
		// Skart1.anzeigen(); funktioniert nicht
		((Spielwaren)Skart1).anzeigen();   
		// Typumwandlung möglich. diesmal nicht notwendig aber später mal hilfreich evtl
		// innere Klammern wandeln Skart1 in Objekt vom Typ bücher um
		// äußere klammer sorgt dafür das wir anzegien methode aufrufen können
		
		

		// mehr zu Typumwandlung:
		
		Waren Spielzeug;
		Besteuerbar besteuerbar = new Spielwaren("Tetris",115.00,4,12);
		
		Spielzeug = (Spielwaren)besteuerbar;
		Spielzeug.anzeigen();
		System.out.println("Die Steuer für "+Spielzeug.getBeschreibung()+" ist "+((Spielwaren)Spielzeug).berechneSteuer()+ " Euro hoch");
	
		// erweiterung Interfaces. Interface besteuerbar wurde durch Interface Verbrauchssteuer erweitert
		Spielwaren Risiko = new Spielwaren("Risiko",25.99,2,12);
		System.out.println("Die Verbrauchssteuer für "+Risiko.getBeschreibung()+" ist "+Risiko.berechneVerbrauchssteuer()+" hoch");
		
		
		Test test1 = new Test("Wacken",12.99,1,"PEter");
		test1.anzeigen();
		System.out.println("Allgemeine Steuer: "+test1.berechneSteuer());
		System.out.println("Verbrauchsstuer: "+test1.berechneVerbrauchssteuer());
	}

}
