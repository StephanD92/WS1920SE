package de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Abo;

public class PremiumAbo extends Abo {

	public PremiumAbo(Abonnent abonnent) {
		super(abonnent);
		System.out.println("Neues Premium-Abo");
	}
	
	@Override
	public double getPreisProJahr() {
		return super.getPreisProJahr() *2;
	}
}