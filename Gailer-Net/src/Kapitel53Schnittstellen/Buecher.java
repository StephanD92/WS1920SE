package Kapitel53Schnittstellen;

public class Buecher extends Waren implements Besteuerbar {

	private String autor;
	
	public Buecher(String beschr,double Preis, int Anzahl, String autor) {
		super(beschr,Preis,Anzahl);
		this.autor = autor;
	}
	
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}



	void anzeigen() {
		super.anzeigen();
		System.out.println("Autor: "+autor);
	}
	
	public double berechneSteuer() {
		return getPreis() * Steuersatz;
	}
	
	
}
