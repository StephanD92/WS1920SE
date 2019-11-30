package Kapitel50Vererbung;

public class JustKlassiker extends Videoband {

	String genre;
	
	
	public JustKlassiker( String ttl, int len, int lgeb,boolean vorhanden,String genre) {
		super(ttl,len,lgeb,vorhanden);
		this.genre = genre;
	}
	
	public void anzeigen() {
		super.anzeigen();
		System.out.println("Genre: "+genre);
	}
	
	public static void main(String[] args) {
		
		JustKlassiker k1 = new JustKlassiker("Snatch",110,1000,true,"Action");
		Videoband k2 = new JustKlassiker("Gladiator",129,15,false,"Heroes");
		
		k1.anzeigen();
		System.out.println();
		
		k2.anzeigen();
		

	}

}
