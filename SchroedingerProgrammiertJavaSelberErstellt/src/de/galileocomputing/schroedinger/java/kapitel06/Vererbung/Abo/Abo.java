package de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Abo;

public class Abo {

	
		private Abonnent abonnent;
	
		public Abo(Abonnent abonnent) {
			super();
			this.abonnent = abonnent;
			System.out.println("Neues Abo");
		}
		public double getPreisProJahr() {
			return 40.0;
		}
		
		public Abonnent getAbonnent() {
			return abonnent;
		}
}
