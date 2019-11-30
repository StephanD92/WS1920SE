package P01_AbstrakteKlassenUndInterfaces;

import java.util.Calendar;

public class Professor extends Mitarbeiter{

	private String lehrgebiet;


	public Professor(String name, String vorname, Adresse adresse, String telefonnummer, Calendar geburtsdatum, String buero, String dienstrufnummer, String lehrgebiet) {
		super(name, vorname, adresse, telefonnummer, geburtsdatum, buero, dienstrufnummer);
		this.lehrgebiet = lehrgebiet;
		
	}

	public String getLehrgebiet() {
		return this.lehrgebiet;
	}
	
	public void setLehrgebiet(String lehrgebiet) {
		this.lehrgebiet = lehrgebiet;
	}
	
	@Override //überlagert
	public String toString() {
		return super.toString()+ 
	        "\nLehrgebiet: " + this.lehrgebiet;
	}	
	@Override
	public void ausgabe() {
		System.out.println(this.toString());
		
	}

}
