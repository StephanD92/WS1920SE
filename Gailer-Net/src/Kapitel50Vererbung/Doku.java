package Kapitel50Vererbung;

public class Doku extends Videoband{

	

	public Doku(String ttl, int len, int lgeb) {
		super(ttl, len, lgeb);
	}


	public Doku(String ttl, int lgeb) {
		super(ttl, lgeb);
	}
	
	public static void main(String[] args) {
		
		Doku d1 = new Doku("gellershagen",90, 5);
		d1.anzeigen();
		
		System.out.println();
		Doku d2 = new Doku("BielefeldTheorie",101,5);
		d2.anzeigen();
	}

}
