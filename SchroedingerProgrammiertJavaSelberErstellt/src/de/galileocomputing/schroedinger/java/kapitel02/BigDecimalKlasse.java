package de.galileocomputing.schroedinger.java.kapitel02;
//import java.io.*;
import java.math.*;

import de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Musikgruppe.EAM;
public class BigDecimalKlasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Rechnen mit BigDecimal ist genauer also float und double.
		
//		System.out.println("bitte zahl eingeben:");
//		int zahl1 = EAM.rInt();
//		int zahl2 = EAM.rInt();
		
		BigDecimal zehn = new BigDecimal("10");
		BigDecimal drei = new BigDecimal("3");
		
		BigDecimal ergebnis = zehn.divide(drei, 5, RoundingMode.HALF_UP);
		// 16 gibt an auf wie viele Stellen gerundet werden soll. rounding mode entscheidet ob auf
		// oder abgerundet werden soll
		System.out.println(ergebnis);
		
		
	}

}
