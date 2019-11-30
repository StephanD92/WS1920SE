package T03_20190423;

public class Girokonto extends Konto {

	private double limit;
	private double dispozins;
	
	public Girokonto(String inhaber, int kontonr, double zinnsatz, double kontostand, double limit, double dispozins) {
		super(inhaber, kontonr, zinnsatz, kontostand);
		this.limit = limit;
		this.dispozins = dispozins;
	}

	@Override
	public void einzahlen(double betrag) {	
	}

	@Override
	public void auszahlen(double betrag) {	
	}

	
}
