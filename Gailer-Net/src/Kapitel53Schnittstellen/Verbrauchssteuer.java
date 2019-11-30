package Kapitel53Schnittstellen;

public interface Verbrauchssteuer extends Besteuerbar {

	
	double Verbrauchssteuer = 0.02;
	double berechneVerbrauchssteuer();
	
	// dieses Interfae erweitert das Interface besteuerbar
}
