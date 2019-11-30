package T01_AbstrakteKlassenUndInterfaces;

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
		return this.strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getHausnummer() {
		return this.hausnummer;
	}

	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}

	public int getPlz() {
		return this.plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return this.ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}
	
	@Override
	public String toString(){
		return this.strasse + " " + this.hausnummer + "\n" + this.plz + " " + this.ort;
	}
	

}
