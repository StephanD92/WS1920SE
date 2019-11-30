package T05_20190507;

import java.io.Serializable;

public class Artikel  {

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

	
}
