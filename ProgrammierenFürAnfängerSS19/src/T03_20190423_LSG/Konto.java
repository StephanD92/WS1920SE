package T03_20190423_LSG;

import java.util.Comparator;

public abstract class Konto implements Operation{
	
	private int kontoNr;
	private String kontoinhaber;
	private double guthabenzins;
	private double kontostand;

	public Konto(int kontoNr, String kontoinhaber, double guthabenzins, double kontostand) {
		this.kontoNr = kontoNr;
		this.kontoinhaber = kontoinhaber;
		this.guthabenzins = guthabenzins;
		this.kontostand = kontostand;
	}

	public String getKontoinhaber() {
		return kontoinhaber;
	}

	public void setKontoinhaber(String kontoinhaber) {
		this.kontoinhaber = kontoinhaber;
	}

	public double getGuthabenzins() {
		return guthabenzins;
	}

	public void setGuthabenzins(double guthabenzins) {
		this.guthabenzins = guthabenzins;
	}

	public double getKontostand() {
		return kontostand;
	}

	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}

	public int getKontoNr() {
		return kontoNr;
	}

	@Override
	public String toString() {
		return this.kontoNr + ";" + this.kontoinhaber + ";" + this.guthabenzins + ";" + this.kontostand;
	}
	
	public static class CompKontoNrAsc implements Comparator<Konto>{

		@Override
		public int compare(Konto k1, Konto k2) {
			return k1.getKontoNr()-k2.getKontoNr();   //Sortierung 
		}
		
	}
	
	
	public static class CompKontoNrDesc implements Comparator<Konto>{

		@Override
		public int compare(Konto k1, Konto k2) {
			return k2.getKontoNr()-k1.getKontoNr();
		}
		
	}
	
	public static class CompKontoInhaberAsc implements Comparator<Konto>{

		@Override
		public int compare(Konto k1, Konto k2) {
			return k1.getKontoinhaber().compareTo(k2.getKontoinhaber());
		}
		
	}
	
	public static class CompKontoInhaberDesc implements Comparator<Konto>{

		@Override
		public int compare(Konto k1, Konto k2) {
			return k2.getKontoinhaber().compareTo(k1.getKontoinhaber());
		}
		
	}
	
	public static class CompKontostandAsc implements Comparator<Konto>{

		@Override
		public int compare(Konto k1, Konto k2) {
			return Double.compare(k1.getKontostand(), k2.getKontostand());
		}
		
	}
	
	public static class CompKontostandDesc implements Comparator<Konto>{

		@Override
		public int compare(Konto k1, Konto k2) {
			return Double.compare(k2.getKontostand(), k1.getKontostand());
		}
		
	}
	

}
