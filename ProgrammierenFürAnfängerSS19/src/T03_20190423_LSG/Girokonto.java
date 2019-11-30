package T03_20190423_LSG;

public class Girokonto extends Konto{
	
	private double kreditlimit;
	private double ueberziehungskredit;

	public Girokonto(int kontoNr, String kontoinhaber, double guthabenzins, double kontostand, double kreditlimit, double ueberziehungszins) {
		super(kontoNr,kontoinhaber,guthabenzins,kontostand);
		this.kreditlimit = kreditlimit;
		this.ueberziehungskredit = ueberziehungszins;
	}
	
	

	public double getKreditlimit() {
		return kreditlimit;
	}


	public void setKreditlimit(double kreditlimit) {
		this.kreditlimit = kreditlimit;
	}



	public double getUeberziehungskredit() {
		return ueberziehungskredit;
	}

	public void setUeberziehungskredit(double ueberziehungskredit) {
		this.ueberziehungskredit = ueberziehungskredit;
	}


	@Override
	public void auszahlen(double betrag) {
		if(super.getKontostand()-betrag >= this.kreditlimit)
			super.setKontostand(super.getKontostand() - betrag);	
	}

	@Override
	public void einzahlen(double betrag) {
		super.setKontostand(super.getKontostand() + betrag);
		
	// durch interface werde ich gezwungen einzahlen und auszahlen zu implementieren
		// jede klasse in java erbt automatisch von Klasse objekt. Objket hat schon toString methode. Daher 
		// braucht man die hier nicht unbedingt
	}
	
	@Override
	public String toString() {
		return super.toString() + ";" + this.kreditlimit + ";" + this.ueberziehungskredit;
	}

}
