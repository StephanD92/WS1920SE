package Kapitel51AbstrakteKlassenPolymorphie;

public class Feiertag extends Karte{

	public Feiertag(String e) {
		empf�nger = e;
	}
	
	
	public void gru�() {
		System.out.println("Lieber "+empf�nger+ " hab einen sch�nen Tag");
	}
	
	public static void main(String[] args) {
		Karte k1 = new Feiertag("Peter");
		k1.gru�();
		Karte k2 = new Valentin("Juli",20);
		k2.gru�();
		Karte k3 = new Geburtstag("jochen",24);
		k3.gru�();
		
//		Feiertag k4 = new Feiertag("gerlinde");
	}

}
