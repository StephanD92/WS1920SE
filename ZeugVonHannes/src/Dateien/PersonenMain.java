package Dateien;

import java.util.*;

import edu.princeton.cs.introcs.StdIn;

public class PersonenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personenverzeichnis personen = new Personenverzeichnis();
		//personen.addPerson(new Person("Hannes", "Dreyer", "2000"));
		//personen.addPerson(new Person("Dreyer", "Hannes", "0002"));
		//personen.saveData(StdIn.readString());
		System.out.println(personen.loadData().toString());
		
	}

}
