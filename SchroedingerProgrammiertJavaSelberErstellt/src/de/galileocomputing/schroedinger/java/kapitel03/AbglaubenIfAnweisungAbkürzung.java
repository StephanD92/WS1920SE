package de.galileocomputing.schroedinger.java.kapitel03;

import de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Musikgruppe.EAM;

public class AbglaubenIfAnweisungAbk�rzung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Diemal lesen wir zahl ein und �bergeben keinen Startparamater
		// ist zahl durch 7 teilbar ODER nicht durch 13 kommt gl�ck gehabt.
		// sonst pech gehabt
		System.out.println("bitte zahl eingeben:");
		int zahl = EAM.rInt();
			if(zahl%7 == 0 || zahl%13 !=0 ) {
			System.out.println("gl�ck gehabt");
			}
			else {
			System.out.println("pech gehabt");
			}
	}

}
