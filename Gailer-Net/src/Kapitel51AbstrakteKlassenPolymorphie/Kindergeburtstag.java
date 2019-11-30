package Kapitel51AbstrakteKlassenPolymorphie;

public class Kindergeburtstag extends Geburtstag {

	
	public Kindergeburtstag(String g, int jahre) {
		super(g, jahre);

	}

	public void gruß() {
		super.gruß();
		System.out.println("Man bist du groß geworden");
	}
	
	
	
	public void gruß(String absender) {
		super.gruß();
		System.out.println("Man bist du groß geworden");
		System.out.println("In Liebe - dein Freund "+absender);
	}
	
//	public void gruß(String absender) {
//		super.gruß();
//		System.out.println("man bist du groß geworden");
//	}
	
}
