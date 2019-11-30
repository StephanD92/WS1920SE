package Kapitel50Vererbung;

public class Musikvideo extends Videoband {

	String kuenstler;
	String kategorie;
	
	public Musikvideo(String ttl, int len, int lgeb, boolean vorhanden,String kuenstler, String kateg) {
		super(ttl,len,lgeb,vorhanden);
		this.kuenstler = kuenstler;
		this.kategorie = kateg;
	}
	
	public void anzeigen() {
		super.anzeigen();
		System.out.println("Kuenstler: "+kuenstler+ "\nKategorie: "+kategorie);
	}
	
	public static void main(String[] args) {
		
		Musikvideo m1 = new Musikvideo("baby",120,5,false,"justin bieber","shit");
		m1.anzeigen();
	}

}
