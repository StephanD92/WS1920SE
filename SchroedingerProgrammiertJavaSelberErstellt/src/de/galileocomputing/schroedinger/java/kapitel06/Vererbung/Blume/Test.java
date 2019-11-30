package de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Blume;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Blume blume2 = new Blume();
	Rose rose1 = new Rose();
	Blume rose2 = new Rose();
	Kamille kamille1 = new Kamille();
	
	rose1.dranriechen();
	System.out.println();
	kamille1.dranriechen();
	}

}
