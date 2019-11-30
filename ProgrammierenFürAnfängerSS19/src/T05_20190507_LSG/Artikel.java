package T05_20190507_LSG;

import java.io.Serializable;

public class Artikel implements Comparable<Artikel>, Serializable {

	// Wichtig: Das Interface Serializable muss implementiert werden, um
	// anzuzeigen, dass diese Klasse serialisierbar ist
	private static final long serialVersionUID = 123688819L;

	private int artikelnummer;
	private String artikelbezeichnung;
	private double artikelpreis;

	public Artikel(int artikelnummer, String artikelbezeichnung, double artikelpreis) {
		this.artikelnummer = artikelnummer;
		this.artikelbezeichnung = artikelbezeichnung;
		this.artikelpreis = artikelpreis;
	}

	public String getArtikelbezeichnung() {
		return artikelbezeichnung;
	}

	public void setArtikelbezeichnung(String artielbezeichnung) {
		this.artikelbezeichnung = artielbezeichnung;
	}

	public double getArtikelpreis() {
		return artikelpreis;
	}

	public void setArtikelpreis(double artikelpreis) {
		this.artikelpreis = artikelpreis;
	}

	public int getArtikelnummer() {
		return artikelnummer;
	}

	@Override
	public String toString() {
		return this.artikelnummer + ";" + this.artikelbezeichnung + ";" + this.artikelpreis;
	}

	@Override
	public int compareTo(Artikel artikel) {
		return this.artikelnummer - artikel.getArtikelnummer();
	}

}
