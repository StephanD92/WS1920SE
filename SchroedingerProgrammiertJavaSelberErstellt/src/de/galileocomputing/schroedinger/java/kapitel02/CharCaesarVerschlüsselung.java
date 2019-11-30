package de.galileocomputing.schroedinger.java.kapitel02;

public class CharCaesarVerschlüsselung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char buchstabe = 'V';
		int rotation = 6; // höhe in der gesprungen werden soll
		int alphabetStart = 'A'-1; //Position von A im index ermittelt -1 damit a auch 1 und nicth 0 ist
		
//		int intbuchstabe = buchstabe;
//		int intAlphabetStart = alphabetStart;
//		
		//intbuchstabe -= intAlphabetStart;
//		
		//System.out.println((int)buchstabe);
		buchstabe -= alphabetStart;     // position des Buchstabens ermitteln
		// bei V: 86(V)-64(alphabetstart) = 22
		buchstabe += rotation;			// rotation auf-addieren also 22+6 = 28
		buchstabe %= 26;				// modulo 26 also 28%26 = 2				
		buchstabe += alphabetStart;		// startposition auf-addieren also 2+64 = 66
										// zahl 66 steht für buchstaben B
										// Alphabetstart ist 64
		
		System.out.println(buchstabe);
		// System.out.println(alphabetStart);
		
		
		
	}

}
