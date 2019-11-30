package CollectionsundSortierung;

public class Artikel implements Comparable<Artikel> {// interface implementieren braucht spitze klammern

	private int artikelnummer;
	private String artikelbezeichnung;
	private double preis;

	public Artikel(int artikelnummer, String artikelbezeichnung, double preis) {
		this.artikelnummer = artikelnummer;
		this.artikelbezeichnung = artikelbezeichnung;
		this.preis = preis;
	}

	public String getArtikelbezeichnung() {
		return artikelbezeichnung;
	}

	public void setArtikelbezeichnung(String artikelbezeichnung) {
		this.artikelbezeichnung = artikelbezeichnung;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public int getArtikelnummer() {
		return artikelnummer;
	}

	public String toString() {
		return this.artikelnummer + ": " + this.artikelbezeichnung + " Preis: " + this.preis + " €.";
	}
	
	@override
	public int compareTo(Artikel a) {
		return this.artikelnummer - a.getArtikelnummer();
	}
	
	public static class ArtikelPreisCompAsc implements Comparator<Artikel> {
		public int compare(Artikel)
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
