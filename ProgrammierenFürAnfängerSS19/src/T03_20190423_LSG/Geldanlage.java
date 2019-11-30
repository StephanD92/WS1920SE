package T03_20190423_LSG;

public abstract class Geldanlage extends Konto{
	
	// weil es abstract ist kann es keine Objekte erstellen
	private int laufzeit;

	public Geldanlage(int kontoNr, String kontoinhaber, double guthabenzins, double kontostand,int laufzeit) {
		super(kontoNr,kontoinhaber,guthabenzins,kontostand);
		this.laufzeit = laufzeit;
	}

	public int getLaufzeit() {
		return laufzeit;
	}

	public void setLaufzeit(int laufzeit) {
		this.laufzeit = laufzeit;
	}

	@Override
	public String toString() {
		return super.toString() + ";" + ";" + this.laufzeit;
	}
	
	

}
