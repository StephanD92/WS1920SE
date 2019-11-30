package T03_20190423;

public class Sparklankonto extends Geldanlage {

	private double rate;

	public Sparklankonto(String inhaber, int kontonr, double zinnsatz, double kontostand, int laufzeit, double rate) {
		super(inhaber, kontonr, zinnsatz, kontostand, laufzeit);
		this.rate = rate;
	}
	
	
	
	
	
}
