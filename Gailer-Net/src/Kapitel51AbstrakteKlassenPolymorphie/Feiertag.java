package Kapitel51AbstrakteKlassenPolymorphie;

public class Feiertag extends Karte{

	public Feiertag(String e) {
		empfänger = e;
	}
	
	
	public void gruß() {
		System.out.println("Lieber "+empfänger+ " hab einen schönen Tag");
	}
	
	public static void main(String[] args) {
		Karte k1 = new Feiertag("Peter");
		k1.gruß();
		Karte k2 = new Valentin("Juli",20);
		k2.gruß();
		Karte k3 = new Geburtstag("jochen",24);
		k3.gruß();
		
//		Feiertag k4 = new Feiertag("gerlinde");
	}

}
