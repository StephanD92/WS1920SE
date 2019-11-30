package Übungsblatt08;

import java.util.Calendar;

public class Student  {

	private String name;
	private String studiengang;
	private int matrikelnummer;
	
	public Student(String name, String studiengang, int matrikelnummer) {
		this.name = name;
		this.studiengang = studiengang;
		this.matrikelnummer = matrikelnummer;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudiengang() {
		return studiengang;
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
		return
			this.name + "Matrnr: " + this.matrikelnummer + "Studiengang:  " + this.studiengang;
	}

//	public void ausgabe() {
//		System.out.println(this.toString());
//		
//	}	
	
	

}
