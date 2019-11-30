package Kapitel53Schnittstellen;

import java.text.NumberFormat;

public class Spielwaren extends Waren implements Besteuerbar, Verbrauchssteuer {

	private int mindestalter;
	
	public Spielwaren(String beschr,double Preis, int anzahl,int mindAlter) {
		super(beschr,Preis,anzahl);
		this.mindestalter = mindAlter;
	}
	
	
	public int getMindestalter() {
		return mindestalter;
	}
	public void setMindestalter(int mindestalter) {
		this.mindestalter = mindestalter;
	}




	void anzeigen() {
		super.anzeigen();
		System.out.println("Mindestalter: "+mindestalter);
	}
	
	public double berechneSteuer() {
		
		return (getPreis() * Steuersatz);
	}
	
	public double berechneVerbrauchssteuer() {
		return getPreis() * Verbrauchssteuer;
	}
}
