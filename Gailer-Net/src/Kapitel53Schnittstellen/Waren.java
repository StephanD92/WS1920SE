package Kapitel53Schnittstellen;

public class Waren {

	private String beschreibung;
	private double Preis;
	private int Anzahl;
	
	public Waren (String beschr, double preis, int anzahl) {
		this.beschreibung = beschr;
		this.Preis = preis;
		this.Anzahl = anzahl;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public double getPreis() {
		return Preis;
	}

	public void setPreis(double preis) {
		Preis = preis;
	}

	public int getAnzahl() {
		return Anzahl;
	}

	public void setAnzahl(int anzahl) {
		Anzahl = anzahl;
	}

	void anzeigen() {
		System.out.println("Artikel: "+beschreibung+"  Preis: "+Preis+ "  Anzahl: "+Anzahl);
	}
	
	
	
}
