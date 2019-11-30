package T02_20190416;

/**
 * Die Klasse Artikel erstellt Objekte der Klasse Artikel. Gleichartige Objekte
 * sollen nach Artikelnummer aufsteigend sortierbar sein.
 * 
 * @author sleonardo
 *
 */

public class Artikel {

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

			
}
