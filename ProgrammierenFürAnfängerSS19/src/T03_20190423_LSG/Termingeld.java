package T03_20190423_LSG;

public class Termingeld extends Geldanlage{
	
	private  double mindestbetrag;

	public Termingeld(int kontoNr, String kontoinhaber, double guthabenzins, double kontostand,int laufzeit, double mindestbetrag) {
		super(kontoNr,kontoinhaber,guthabenzins,kontostand, laufzeit);
		this.mindestbetrag = mindestbetrag;
	}

	public double getMindestbetrag() {
		return mindestbetrag;
	}

	public void setMindestbetrag(double mindestbetrag) {
		this.mindestbetrag = mindestbetrag;
	}

	@Override
	public void auszahlen(double betrag) {
		if(super.getKontostand()-betrag >= 0)
			super.setKontostand(super.getKontostand() - betrag);
	}

	@Override
	public void einzahlen(double betrag) {
		if(betrag >= this.mindestbetrag)
			super.setKontostand(super.getKontostand() + betrag);
		
	}
	
	@Override
	public String toString() {
		return super.toString() + ";" + this.mindestbetrag;
	}


}
