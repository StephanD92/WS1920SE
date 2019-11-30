package P01_AbstrakteKlassenUndInterfaces;

import java.util.Calendar;

public class Student extends Hochschulangehoeriger {

	private String studiengang;
	private int matrikelnummer;
	
	public Student(String name, String vorname, Adresse adresse, String telefonnumer, Calendar geburtsdatum,
			String studiengang, int matrikelnummer) {
		super(name, vorname, adresse, telefonnumer, geburtsdatum);
		this.studiengang = studiengang;
		this.matrikelnummer = matrikelnummer;
	}

	public String getStudiengang() {
		return this.studiengang;
	}

	public void setStudiengang(String studiengang) {
		this.studiengang = studiengang;
	}

	public int getMatrikelnummer() {
		return this.matrikelnummer;
	}

	public void setMatrikelnummer(int matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}
	
	@Override
	public String toString() {
		return super.toString()+ 
	       "\nMatrikelnummer: " + this.matrikelnummer + 
	       "\nStudiengang: " + this.studiengang;
	}

	@Override
	public void ausgabe() {
		System.out.println(this.toString());
		
	}	
	
	

}
