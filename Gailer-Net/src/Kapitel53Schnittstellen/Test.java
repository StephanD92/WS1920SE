package Kapitel53Schnittstellen;

public class Test extends Waren implements Verbrauchssteuer {

	private String testvariable;
	
	public Test(String beschr,double preis, int Anzahl, String testvariable) {
		super(beschr,preis,Anzahl);
		this.testvariable = testvariable;
	}
	
	public String getTestvariable() {
		return testvariable;
	}

	public void setTestvariable(String testvariable) {
		this.testvariable = testvariable;
	}


	void anzeigen() {
		super.anzeigen();
		System.out.println("Testvariable: "+testvariable);
	}

	/*dadurch das das INterface Verbrauchssteuer das INterface Besteuerbar erweitert reicht es in dieser Klasse
	das Interface Verbrauchssteuer zu implmentieren und schon kann ich auch auf die Methode berechneSteuer() von 
	dem Interface Besteuerbar zugreifen
	*/
	
	@Override
	public double berechneSteuer() {
		
		return getPreis() * Steuersatz;
	}

	@Override
	public double berechneVerbrauchssteuer() {
		
		return getPreis() * Verbrauchssteuer;
	}
	
	
	
}
