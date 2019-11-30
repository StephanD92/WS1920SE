package T02_20190416_LSG;

import java.util.Comparator;

/**
 * Die Klasse Artikel erstellt Objekte der Klasse Artikel. Gleichartige Objekte
 * sollen nach Artikelnummer aufsteigend sortierbar sein.
 * 
 * @author sleonardo
 *
 */
/* 
 * Artikelklasse muss das Interface Comparable<Artikel> implementieren
 */
public class Artikel implements Comparable<Artikel> {

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

	/*
	 * Nach der Implentierung des Interfaces muss zwingend die Methode
	 * compareTo(Artikel a) des Interfaces Comparable überschrieben
	 * werden.
	 */
	@Override
	public int compareTo(Artikel a) {
		
		return this.artikelnummer - a.getArtikelnummer();
		
		/* *********************************
		 * * Weitere Sortiermöglichkeiten: *
		 * *********************************
		 * 
		 * Bei ganzzahligen Datentypen:
		 * ===========================
		 * return this.artikelnummer - a.getArtikelnummer() -> nach Artikelnummer aufsteigend
		 * return a.getArtikelnummer() - this.artikelnummer -> nach Artikelnummer absteigend
		 * 
		 * Bei Fließkommawerten:
		 * =====================
		 * return Double.compare(this.preis,a.getPreis()) -> Nach Preis aufsteigend
		 * return Double.compare(a.getPreis(),this.preis) -> nach Preis absteigend
		 * return ((Double)this.preis).compareTo((Double)a.getPreis()) -> Nach Preis aufsteigend
		 * return ((Double)a.getPreis()).compareTo((Double)this.preis) -> nach Preis absteigend
		 * 
		 * Bei Zeichenketten:
		 * ==================
		 * return this.artikelbezeichnung.compareTo(a.getArtikelbezeichnung()) -> nach Artikelbezeichnung aufsteigend
		 * return a.getArtikelbezeichnung().compareTo(this.artikelbezeichnung) -> nach Artikelbezeichnung absteigend
		 */
				
	}
	/**
	 * Information hinterlegen
	 * @author sleonardo
	 *
	 */
	
	public static class ArtikelNameCompDesc implements Comparator<Artikel> {

		/*
		 * Nach der Implentierung des Interfaces muss zwingend die Methode
		 * compare(Artikel a1, Artikel a2) des Interfaces Comparator überschrieben
		 * werden.
		 */
		@Override
		public int compare(Artikel a1, Artikel a2) {
			
			return a2.getArtikelbezeichnung().compareTo(a1.getArtikelbezeichnung());
			
			/* *********************************
			 * * Weitere Sortiermöglichkeiten: *
			 * *********************************
			 * 
			 * Bei ganzzahligen Datentypen:
			 * ===========================
			 * return a1.getArtikelnummer() - a2.getArtikelnummer() -> nach Artikelnummer aufsteigend
			 * return a2.getArtikelnummer() - a1.getArtikelnummer -> nach Artikelnummer absteigend
			 * 
			 * Bei Fließkommawerten:
			 * =====================
			 * return Double.compare(a1.getPreis(),a2.getPreis()) -> Nach Preis aufsteigend
			 * return Double.compare(a2.getPreis(),a1.getPreis()) -> nach Preis absteigend
			 * return ((Double)a1.getPreis()).compareTo((Double)a2.getPreis()) -> Nach Preis aufsteigend
			 * return ((Double)a2.getPreis()).compareTo((Double)a1.getPreis()) -> nach Preis absteigend
			 * 
			 * Bei Zeichenketten:
			 * ==================
			 * return a1.getArtikelbezeichnung().compareTo(a2.getArtikelbezeichnung()) -> nach Artikelbezeichnung aufsteigend
			 * return a2.getArtikelbezeichnung().compareTo(a1.getArtikelbezeichnung()) -> nach Artikelbezeichnung absteigend
			 */
			
		}

	}
	public static class ArtikelPreisCompAsc implements Comparator<Artikel> {

		/*
		 * Nach der Implentierung des Interfaces muss zwingend die Methode
		 * compare(Artikel a1, Artikel a2) des Interfaces Comparator überschrieben
		 * werden.
		 */
		@Override
		public int compare(Artikel a1, Artikel a2) {
			return Double.compare(a1.getPreis(), a2.getPreis());
		}
	}
			
}
