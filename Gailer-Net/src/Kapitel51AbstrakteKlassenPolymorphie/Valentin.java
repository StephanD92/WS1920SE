package Kapitel51AbstrakteKlassenPolymorphie;

public class Valentin extends Karte {

	int kuesse;
	
	public Valentin(String e, int k) {
		empf�nger = e;
		kuesse = k;
	}
	
	public void gru�() {
		System.out.println("Hey "+empf�nger+" ich liebe dich und sende dir heute "+kuesse+" schmatzende K�sse");
//		System.out.println("Dear " + empf�nger + ",\n");
//	    System.out.println("herzliche Gruesse und Kuesse,\n");
//	    for ( int j = 0; j < kuesse; j++ )
//	      System.out.print("X");
//	    System.out.println("\n\n");
	}
	
	public static void main(String[] args) {
	
		Valentin v1 = new Valentin("Mausi",23);
		Karte v2 = new Valentin("Uschi",3);
		v1.gru�();
		System.out.println();
		v2.gru�();
		
		Karte karte1;
		
		karte1 = new Geburtstag("Willi",23);
		karte1.gru�();
		
		Karte karte2;
		Geburtstag geb = new Geburtstag("Lucinda", 42);

		karte2 = geb;   //  ist das korrekt?	
		geb.gru�();

	}

}
