package de.galileocomputing.schroedinger.java.kapitel02;

import java.io.*;
import java.math.*;

public class TestZahlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// primitive Datentypen (ganzzahlen)
		
		long l = 23456782345678L;
		/*ohne das L am ende ist der Standarddatentyp int
		und es gibt einen Fehler. Das gleiche gilt für Fließkommazahlen. Hier ist double der
		Standardtyp und float muss mit eine F gekennzeichnet werden. (Es geht groß und kleinschreibung
		es wird aber empfohlen große Buchstaben zu verwenden. byte und short kann ich ohne Endung
		verwenden
		*/// L am ende (sonst int und fehlermeldung) 
		
		int i = 1000304;
		byte b = 120;
		short s = 4453;
		double d = 4.045;
		float f = 5.959F; // F am ende (sonst double und fehlermeldung)
		// float e = 5.344; ergibt fehler weil F fehlt
		/*
		System.out.println("int = "+i);
		System.out.println("long = "+l);
		System.out.println("double = "+ d);
		System.out.println("float = "+f);
		System.out.println("byte = "+b);
		System.out.println("short s = "+s);
		System.out.println();
		*/
		// Lesbarkeit erhöhen: Unterstriche bei langen Zahlen. Bsp:
		
		long kreditKartennummer = 2345_____2345____2345___23__45L; //ausgegeben wird ohne die Striche
		
		System.out.println("long lesbarkeit verbessert (nur im Code für Entwickeler): "+kreditKartennummer);
		
		/* Unterstriche dürfen nicht vorkommen 
		- direkt neben Punkt
		- vor dem Buchstaben
		- Am Anfang oder Ende einer Zahl
		*/
		
		/*float einFloatMitNullDavor = 00002.02345F;
		System.out.println("float mit 0 davor: "+einFloatMitNullDavor);
		*/
		
		int hexZahl = 0X16D; // eine 0x oder 0X davor
		int oktalzahl = 0555; // eine Null O davor
		int dezimalzahl = 365; // nix davor, standard ist halt dezimal
		int binaerZahl = 0B101101101; // 0B oder 0b davor
		
		int oktazahl1 = 0735535; //735535 in oktal
		int bereitsoktal = oktazahl1;
		
		System.out.println("Hexzahl: "+hexZahl); // ausgabe ist 365, er rechnet also um
		System.out.println("Oktahlzahl: "+oktalzahl);
		System.out.println("Dezimalzahl:"+dezimalzahl);
		System.out.println("Binärzahl: "+binaerZahl);
		System.out.println();
		System.out.println("2.Oktazahl:"+oktazahl1);
		System.out.println("bereitsoktahl:"+bereitsoktal);
		
		// genau rechnen mit fließkommazaheln, float und double sind oft nicht genau
		// besser ist bigdecimal
		// wir wollen 10/3 ausrechnen, haben also viele nachkommastellen
		
		BigDecimal zehn = new BigDecimal("10");
		BigDecimal drei = new BigDecimal("3");
		//Wichtig: BigDecimal immer als Zeichenkette mit dem "" übergeben 
		//ein new BigDecimal(10.0); würde einen fehler erzeugen
		BigDecimal ergebnis = zehn.divide(drei, 16, RoundingMode.HALF_UP);
		System.out.println("Ergebnis teilung:"+ergebnis);
		
	}

}
