package de.galileocomputing.schroedinger.java.kapitel02;

public class TestZahlenAbk�rzungOperationen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int zahl = 5;
		// abk�rzende schreibweisen f�r verschiedene Operationen
		zahl +=10; //zahl + 10
		zahl -=5; // zahl - 5 
		zahl /=9; // zahl /9
		zahl %=4; // zahl %4
		System.out.println(zahl);
		
		
		
		
		
		// Inkrement (++) und Dekrement (--) Operatoren
		// pr�fix operator ist --zahl    (Pr�fix-Schreibweise)
		// postfix operator ist zahl--   (Postfix-Schreibweise)
		//System.out.println(++zahl);  //addiert 1 drauf und gibt dann aus = 6
		//System.out.println(zahl++);  // gibt erst aus (6) und addiert dann. somit steht auf KOnsole 6, zahl hat aber Wert 7
		//System.out.println(zahl); // beweis das zuvor addiert wurde
	}

}
