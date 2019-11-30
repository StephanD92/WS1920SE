package P01_AbstrakteKlassenUndInterfaces;
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Hochschulangehoeriger implements Verwaltungstools {
	
	// unterschied abstract. abstract klasse kann nicht instanziiert werden.
	// kann doch über konstruktor oder instanzvariable verfügen

	private String name;
	private String vorname;
	private Adresse adresse;
	private String telefonnumer;
	private Calendar geburtsdatum;
	
	public Hochschulangehoeriger(String name, String vorname, Adresse adresse, String telefonnumer,
			Calendar geburtsdatum) {
		this.name = name;
		this.vorname = vorname;
		this.adresse = adresse;
		this.telefonnumer = telefonnumer;
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

	public String getTelefonnumer() {
		return this.telefonnumer;
	}

	public void setTelefonnumer(String telefonnumer) {
		this.telefonnumer = telefonnumer;
	}

	public Calendar getGeburtsdatum() {
		return this.geburtsdatum;
	}


	public void setGeburtsdatum(Calendar geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	@Override
	public String toString() {
		return this.vorname +" " + this.name + "\n"+ this.adresse + "\nTelefonnummer: "+ this.telefonnumer +
				"\nGeburtsdatum: " + this.geburtsdatum.get(Calendar.DAY_OF_MONTH) + "."
								   + this.geburtsdatum.get(Calendar.MONTH) + "."
								   + this.geburtsdatum.get(Calendar.YEAR);
		// toString methode muss separat gemacht werden OBWOHL ich das nicht muss
	}

}
