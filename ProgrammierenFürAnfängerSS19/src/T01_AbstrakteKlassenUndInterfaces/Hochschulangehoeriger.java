package T01_AbstrakteKlassenUndInterfaces;
import java.util.Calendar;

public abstract class Hochschulangehoeriger implements Verwaltungstools{

	private String name;
	private String vorname;
	private Adresse adresse;
	private String telefonnummer;
	private Calendar geburtsdatum;

	public Hochschulangehoeriger(String name, String vorname, Adresse adresse, String telefonnummer,
			Calendar geburtsdatum) {
		this.name = name;
		this.vorname = vorname;
		this.adresse = adresse;
		this.telefonnummer = telefonnummer;
		this.geburtsdatum = geburtsdatum;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return this.vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public Adresse getAdresse() {
		return this.adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getTelefonnummer() {
		return this.telefonnummer;
	}

	public void setTelefonnummer(String telefonnummer) {
		this.telefonnummer = telefonnummer;
	}

	public Calendar getGeburtsdatum() {
		return this.geburtsdatum;
	}

	public void setGeburtsdatum(Calendar geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	@Override
	public String toString() {
		return this.vorname + " " + this.name + 
			   "\n" + this.adresse.toString() + "\nTelefonnummer: " + this.telefonnummer + 
			   "\nGeburtsdatum: " + this.geburtsdatum.get(Calendar.DAY_OF_MONTH) + "." 
			                      + this.geburtsdatum.get(Calendar.MONTH) + "." 
			                      + this.geburtsdatum.get(Calendar.YEAR);
	}

}
