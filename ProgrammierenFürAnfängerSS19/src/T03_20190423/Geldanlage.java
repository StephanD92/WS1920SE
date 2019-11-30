package T03_20190423;

public abstract class Geldanlage extends Konto{

	private int laufzeit;
	
	
	public Geldanlage(String inhaber, int kontonr, double zinnsatz, double kontostand, int laufzeit) {
		super(inhaber, kontonr, zinnsatz, kontostand);
		this.laufzeit = laufzeit;
	}
	public int getLaufzeit() {
		return laufzeit;
	}

	public void setLaufzeit(int laufzeit) {
		this.laufzeit = laufzeit;
	}
	
	@Override
	public void einzahlen(double betrag) {		
	}
	@Override
	public void auszahlen(double betrag) {	
	}
	
	

	
	
	
}
