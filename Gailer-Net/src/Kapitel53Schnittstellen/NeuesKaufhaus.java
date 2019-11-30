package Kapitel53Schnittstellen;

public class NeuesKaufhaus {

	public static void main(String[] args) {
		
		
		Waren w1 = new Waren("Pommes",1.99,10);
		w1.anzeigen();
		
		Spielwaren Siedler = new Spielwaren("Sieder",2123.99,10,12);
		System.out.println("Die Steuer für "+Siedler.getBeschreibung()+" ist "+Siedler.berechneSteuer()+" Euro hoch");
		
		

	}

}
