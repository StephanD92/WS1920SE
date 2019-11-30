package P01_AbstrakteKlassenUndInterfaces;

import java.util.Calendar;

public class Mitarbeiter extends Hochschulangehoeriger {

	private String buero;
	private String dienstrufnummer;

	public Mitarbeiter(String name, String vorname, Adresse adresse, String telefonnummer, Calendar geburtsdatum, String buero, String dienstrufnummer) {
		super(name, vorname, adresse, telefonnummer, geburtsdatum);
		// über super werden parameter der abstrakten klasse übergeben.
		// immer zuerst den Konstruktor der beerbten Klasse bedienen
		this.buero = buero;
		this.dienstrufnummer = dienstrufnummer;
	}

	public String getBuero() {
		return this.buero;
	}

	public void setBuero(String buero) {
		this.buero = buero;
	}

	public String getDienstrufnummer() {
		return this.dienstrufnummer;
	}
	
	public void setDienstrufnummer(String dienstrufnummer) {
		this.dienstrufnummer = dienstrufnummer;
	}

	
	@Override
	public String toString() {
		return super. toString() +
	        "\nBüro: " + this.buero + 
	        "\nDienstl. Rufnummer: " + this.dienstrufnummer;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void ausgabe() {
		System.out.println(this.toString());
		
	}


}
