package Kapitel51AbstrakteKlassenPolymorphie;

public class Geburtstag extends Karte{
	
	int alter;

	
	public Geburtstag(String g, int jahre) {
		empf�nger = g;
		alter = jahre;
	}
	
	public void gru�() {
		System.out.println("Hi "+empf�nger+" Alles gute Zum "+alter+".Geburtstag mein freund");
	}
	
	public static void main(String[] args) {
		
		Karte karte = new Geburtstag("Willi",25);
		karte.gru�();

	}



}
