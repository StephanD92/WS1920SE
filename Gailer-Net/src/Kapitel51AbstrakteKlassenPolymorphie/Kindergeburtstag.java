package Kapitel51AbstrakteKlassenPolymorphie;

public class Kindergeburtstag extends Geburtstag {

	
	public Kindergeburtstag(String g, int jahre) {
		super(g, jahre);

	}

	public void gru�() {
		super.gru�();
		System.out.println("Man bist du gro� geworden");
	}
	
	
	
	public void gru�(String absender) {
		super.gru�();
		System.out.println("Man bist du gro� geworden");
		System.out.println("In Liebe - dein Freund "+absender);
	}
	
//	public void gru�(String absender) {
//		super.gru�();
//		System.out.println("man bist du gro� geworden");
//	}
	
}
