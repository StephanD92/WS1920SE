package Kapitel51AbstrakteKlassenPolymorphie;

public class ErwachsenenGeburtstag extends Geburtstag {

	
	public ErwachsenenGeburtstag(String g, int a) {
		super(g,a);
	}
	
	public void gru�() {
		super.gru�();
		System.out.println("Du siehst so jung aus wie immmer!");
	}
}
