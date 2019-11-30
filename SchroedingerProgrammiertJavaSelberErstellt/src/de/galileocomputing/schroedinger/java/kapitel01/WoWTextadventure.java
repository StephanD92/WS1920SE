package de.galileocomputing.schroedinger.java.kapitel01;

import java.io.*;

public class WoWTextadventure {

	public static void main(String[] args) throws IOException{
		
		System.out.println("Hallo "+ args[0] + ", willkommen in der World of Warcraft"
				+ ". Du befindest dich im Dorf Buxelknuxel.");
		System.out.println("Verwende die Tasten 'N', 'O', 'S' und 'W', um dich zu"
				+ "bewegen, und 'I', um einen Blick in dein Inventar zu werfen.");
		System.out.println("Mit 'Q' verl�sst du das Spiel.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String befehl;
		while ((befehl = br.readLine() ) != null) {
			switch (befehl.toLowerCase()) {
			case "n":
				System.out.println("Du gehst nach Norden.");
				break;
			case "o":
				System.out.println("Du gehst nach Osten.");
				break;
			case "s":
				System.out.println("Du gehst nach S�den");
				break;
			case "w":
				System.out.println("Du gehst nach Westen.");
				break;
			case "q":
				System.out.println("Willst du wirklich aufh�ren? Y/N");
				String bestaetigung = br.readLine();
				switch (bestaetigung.toLowerCase()) {
				
				case "y":
					System.out.println("Und Tsch�ss.");
					System.exit(0);
					break;
				case "n":
					System.out.println("Finde ich prima.");
					break;
				}
				break;
			case "":
				System.out.println("Du willst garnichts machen? Das glaube ich nicht.");
				break;
				
			case "i":
				System.out.println("Da du noch nicht die Weisheit der Array-kundigen Sammmler erlangt"
						+ " hast, befindt sich in deinme Inventar nur ein einziger Gegenstand:"
						+ "ein Holzschwert.");
				break;
			
			default:
				System.err.println("Das verstehe ich nicht.");
			}
		}
			
	}

}
