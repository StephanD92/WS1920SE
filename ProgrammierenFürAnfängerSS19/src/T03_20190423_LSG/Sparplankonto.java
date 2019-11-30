package T03_20190423_LSG;

public class Sparplankonto extends Geldanlage{
	
	private double sparrate;

	public Sparplankonto(int kontoNr, String kontoinhaber, double guthabenzins, double kontostand,int laufzeit, double sparrate) {
		super(kontoNr,kontoinhaber,guthabenzins,kontostand, laufzeit);
		this.sparrate = sparrate;
	}


	public double getSparrate() {
		return sparrate;
	}



	public void setSparrate(double sparrate) {
		this.sparrate = sparrate;
	}



	@Override
	public void auszahlen(double betrag) {
		if(super.getKontostand()-betrag >= 0)
			super.setKontostand(super.getKontostand() - betrag);
	}

	@Override
	public void einzahlen(double betrag) {
		if(betrag >= this.getSparrate())
			super.setKontostand(super.getKontostand() + betrag);
		
	}
	@Override
	public String toString() {
		return super.toString() + ";" + this.sparrate;
	}


}
