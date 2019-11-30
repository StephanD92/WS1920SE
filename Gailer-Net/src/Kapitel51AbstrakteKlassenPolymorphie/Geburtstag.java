package Kapitel51AbstrakteKlassenPolymorphie;

public class Geburtstag extends Karte{
	
	int alter;

	
	public Geburtstag(String g, int jahre) {
		empfänger = g;
		alter = jahre;
	}
	
	public void gruß() {
		System.out.println("Hi "+empfänger+" Alles gute Zum "+alter+".Geburtstag mein freund");
	}
	
	public static void main(String[] args) {
		
		Karte karte = new Geburtstag("Willi",25);
		karte.gruß();

	}



}
