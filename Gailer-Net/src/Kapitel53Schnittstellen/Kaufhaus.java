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
//		System.out.println("Die Steuer f�r Ware "+Spiel.beschreibung+" betr�gt "+Spiel.berechneSteuer()+" Euro");
//		System.out.println();
//		
//		Buecher b1 = new Buecher("Bibel",15.99,"Gott");
//		b1.anzeigen();
//		System.out.println("Die Steuer f�r Ware "+b1.beschreibung+" betr�gt " +b1.berechneSteuer()+" Euro");
		
		Waren[] inventar = new Waren[5];
//		inventar[0] = Klopapier; // kann man auch direkt reinschreiben wenn bereits vorhanden
//		inventar[1] = new Waren("Tube",5.99);
		inventar[2] = new Lebensmittel("K�se",2.49,5,10);
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
//		System.out.println("Die Steuer f�r Skart1 betr�gt: "+Skart1.berechneSteuer()+" Euro");
		
		
		
		//Typumwandlung:
		
		
		Besteuerbar Skart1 = new Spielwaren("Skart",15.99,10,12); 
		// ist m�glich aber man kann dann nur die Methoden des INterfaces aufrufen
		// die Methoden von Spielwaren oder Artikel (also anzeigen k�nnen nnicht aufgerufen werden
		// Skart1.anzeigen(); funktioniert nicht
		((Spielwaren)Skart1).anzeigen();   
		// Typumwandlung m�glich. diesmal nicht notwendig aber sp�ter mal hilfreich evtl
		// innere Klammern wandeln Skart1 in Objekt vom Typ b�cher um
		// �u�ere klammer sorgt daf�r das wir anzegien methode aufrufen k�nnen
		
		

		// mehr zu Typumwandlung:
		
		Waren Spielzeug;
		Besteuerbar besteuerbar = new Spielwaren("Tetris",115.00,4,12);
		
		Spielzeug = (Spielwaren)besteuerbar;
		Spielzeug.anzeigen();
		System.out.println("Die Steuer f�r "+Spielzeug.getBeschreibung()+" ist "+((Spielwaren)Spielzeug).berechneSteuer()+ " Euro hoch");
	
		// erweiterung Interfaces. Interface besteuerbar wurde durch Interface Verbrauchssteuer erweitert
		Spielwaren Risiko = new Spielwaren("Risiko",25.99,2,12);
		System.out.println("Die Verbrauchssteuer f�r "+Risiko.getBeschreibung()+" ist "+Risiko.berechneVerbrauchssteuer()+" hoch");
		
		
		Test test1 = new Test("Wacken",12.99,1,"PEter");
		test1.anzeigen();
		System.out.println("Allgemeine Steuer: "+test1.berechneSteuer());
		System.out.println("Verbrauchsstuer: "+test1.berechneVerbrauchssteuer());
	}

}
