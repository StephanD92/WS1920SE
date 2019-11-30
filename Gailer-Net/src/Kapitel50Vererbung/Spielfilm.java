package Kapitel50Vererbung;

public class Spielfilm extends Videoband {
	
	String regisseur;
	String bewertung;
	
	
	
	public Spielfilm (String ttl, int leng, String reg, String bew) {
	super(ttl,leng);
	this.regisseur = reg;
	this.bewertung = bew;
	}

   
	
	public static void main(String[] args) {
		
		Spielfilm RED = new Spielfilm("RED", 90, "Wacken von Goch","Geiler Shit");
		RED.anzeigen();
//		Videoband V1 = new Videoband("neuer Titel ");
//		V1.anzeigen();
//		Videoband v2 = new Spielfilm("wacken", 118,"blaba","geil");
//		v2.anzeigen();
		
	}
	 
	public void anzeigen() {
	    super.anzeigen();	
		System.out.println("Regisseur: "+regisseur+"\nBewertung: "+bewertung);
	    }

}
