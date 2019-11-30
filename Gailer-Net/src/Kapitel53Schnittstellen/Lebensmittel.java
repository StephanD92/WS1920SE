package Kapitel53Schnittstellen;

public class Lebensmittel extends Waren{

	
	private double kalorien;
	
	public Lebensmittel(String beschr, double Preis, int Anzahl, double Kalorien) {
		super(beschr,Preis,Anzahl);
		this.kalorien = Kalorien;
	}
	
	public double getKalorien() {
		return kalorien;
	}
	public void setKalorien(double kalorien) {
		this.kalorien = kalorien;
	}



	void anzeigen() {
		super.anzeigen();
		System.out.println("Kalorien: "+kalorien);
	}
	
}
