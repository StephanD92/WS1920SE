package de.galileocomputing.schroedinger.java.kapitel01;

import java.io.IOException;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner eingabewert = new Scanner(System.in);
		
		// Int-zahlen eingabe mit Scanner realisiert, da es
		// mit System.in nicht geklappt hat
		System.out.println("bitte alter eingeben");
		int alter = eingabewert.nextInt();
		System.out.println("Alter angegeben: "+alter);
		
		// buch was es so vorgeschlagen:
		//int alter = System.in.read();
		
	}

}
