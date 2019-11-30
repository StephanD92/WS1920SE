package de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Abo;

public class AboPreisBerechner {

	public double berechnePreisInklusiveRabatt(Abo abo) {
		double preis1 = 0;
		if(abo instanceof SuperPremiumAbo) {
			if(abo.getAbonnent().getAlter() < 18) {
				preis1 = abo.getPreisProJahr() * 0.5;
			}
		} else if(abo instanceof PremiumAbo) {
			if(abo.getAbonnent().getAlter() < 18) {
				preis1 = abo.getPreisProJahr() * 0.75;
			}
		} else {
			preis1 = abo.getPreisProJahr();
//			return preis;
		}
		return preis1;
	}

		public static void main(String[] args) {
			Abonnent abonnent1 = new Abonnent(16);
			Abonnent abonnent2 = new Abonnent(21);
			Abonnent abonnent3 = new Abonnent(15);
//			Abo abo = new SuperPremiumAbo(abonnent1);
			Abo abo2 = new SuperPremiumAbo(abonnent2);
//			Abo abo3 = new SuperPremiumAbo (abonnent3);
			AboPreisBerechner aboPreisBerechner = new AboPreisBerechner();
//			System.out.println("Preis inklusive Rabatt ABO1:   "+aboPreisBerechner.berechnePreisInklusiveRabatt(abo)+"  Euronen");
			System.out.println("Preis inklusive Rabatt ABO2:   "+aboPreisBerechner.berechnePreisInklusiveRabatt(abo2)+" Euronen");
//			System.out.println("Preis inklusive Rabatt ABO3:   "+aboPreisBerechner.berechnePreisInklusiveRabatt(abo3)+" Euronen");	
		}

}
