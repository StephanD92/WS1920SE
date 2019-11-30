package de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Abo;

public class SuperPremiumAbo extends PremiumAbo {

	public SuperPremiumAbo(Abonnent abonnent) {
		super(abonnent);
		System.out.println("Neues Super-Premium-Abo");
	}
	
	@Override
	public double getPreisProJahr() {
		return super.getPreisProJahr()*2;
	}
//	public static void main(String[] args) {
//		Abo abo = new SuperPremiumAbo();
//		System.out.println(abo.getPreisProJahr());
//		Konstruktoren werden nicht überschrieben also gibt jeder Konstruktor einmal seine 
//		system out println ausgabe aus. Methoden werden überschrieben. Am anfang sind es 20 Euro, 
//		dann mal 2 und dann nochmal mal 2. Also ist die Ausgabe 80. Und das nur einmal und nicht
//		wie bei den Konstruktoren hintereinandeR
	}
	
//}
