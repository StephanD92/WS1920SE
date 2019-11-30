package de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Abo;

public class Main {

	public static void main(String[] args) {
		Abonnent abonnent1 = new Abonnent(19);
		Abo abo = new SuperPremiumAbo(abonnent1);
		AboPreisBerechner aboPreisBerechner = new AboPreisBerechner();
		System.out.println("was?");
		System.out.println(aboPreisBerechner.berechnePreisInklusiveRabatt(abo));
		
		
		
		
	}
	
}
