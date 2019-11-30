package P01_AbstrakteKlassenUndInterfaces;

public class Adresse {
	
	private String strasse;
	private String hausnummer;
	private int plz;
	private String ort;

	public Adresse(String strasse, String hausnummer, int plz, String ort) {
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.plz = plz;
		this.ort = ort;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getHausnummer() {
		return hausnummer;
	}
	
	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}
	
	public int getPlz() {
		return plz;
	}
	
	public void setPlz(int plz) {
		this.plz = plz;
	}
	
	public String getOrt() {
		return ort;
	}
	
	public void setOrt(String ort) {
		this.ort = ort;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String toString() {
		return this.strasse + " " + this.hausnummer + "\n" + this.plz+ " "+this.ort;
	}

}
