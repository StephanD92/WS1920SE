
public class Artikel implements Comparable<Artikel> {

	
	private int artikelnummer;
	private String artikelname;
	private double preis;
	
	
	public Artikel(int ANr,String Aname,double preis) {
		this.artikelnummer = ANr;
		this.artikelname = Aname;
		this.preis = preis;
	}
	
	
	
	
	public String getArtikelname() {
		return artikelname;
	}
	public void setArtikelname(String artikelname) {
		this.artikelname = artikelname;
	}
	
	public int getArtikelnummer() {
		return artikelnummer;
	}
	
	public void setArtikelnummer(int artikelnummer) {
		this.artikelnummer = artikelnummer;
	}
	
	public double getPreis () {
		return preis;
	}
	
	public void setPreis(double preis) {
		this.preis = preis;
	}


	@Override
	public String toString() {
		return "Artikel [artikelnummer=" + artikelnummer + ", artikelname=" + artikelname + ", preis=" + preis + "]";
	}
	// nach artikelnummer absteigen sortieren
//	public int compareTo(Artikel arg0) {
//		return arg0.artikelnummer - this.artikelnummer;
//	}
	
	//nach name sortieren (aufsteigen anfangsbuchstabe)
	public int compareTo(Artikel arg0) {
		return arg0.artikelname.compareTo(this.artikelname);
	}
	
	
	
	
}
