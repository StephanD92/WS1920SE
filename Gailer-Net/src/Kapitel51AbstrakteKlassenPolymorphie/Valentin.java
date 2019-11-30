package Kapitel51AbstrakteKlassenPolymorphie;

public class Valentin extends Karte {

	int kuesse;
	
	public Valentin(String e, int k) {
		empfänger = e;
		kuesse = k;
	}
	
	public void gruß() {
		System.out.println("Hey "+empfänger+" ich liebe dich und sende dir heute "+kuesse+" schmatzende Küsse");
//		System.out.println("Dear " + empfänger + ",\n");
//	    System.out.println("herzliche Gruesse und Kuesse,\n");
//	    for ( int j = 0; j < kuesse; j++ )
//	      System.out.print("X");
//	    System.out.println("\n\n");
	}
	
	public static void main(String[] args) {
	
		Valentin v1 = new Valentin("Mausi",23);
		Karte v2 = new Valentin("Uschi",3);
		v1.gruß();
		System.out.println();
		v2.gruß();
		
		Karte karte1;
		
		karte1 = new Geburtstag("Willi",23);
		karte1.gruß();
		
		Karte karte2;
		Geburtstag geb = new Geburtstag("Lucinda", 42);

		karte2 = geb;   //  ist das korrekt?	
		geb.gruß();

	}

}
