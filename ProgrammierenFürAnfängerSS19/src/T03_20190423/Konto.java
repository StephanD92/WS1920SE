package T03_20190423;

public abstract class Konto implements Kontobewegung {

	private String Inhaber;
	private int kontonr;
	private double zinnsatz;
	private double kontostand;
	
	public Konto(String inhaber, int kontonr, double zinnsatz, double kontostand) {
		this.Inhaber = inhaber;
		this.kontonr = kontonr;
		this.zinnsatz = zinnsatz;
		this.kontostand = kontostand;
	}

	public String getInhaber() {
		return Inhaber;
	}
	public void setInhaber(String inhaber) {
		Inhaber = inhaber;
	}

	public double getZinnsatz() {
		return zinnsatz;
	}
	public void setZinnsatz(double zinnsatz) {
		this.zinnsatz = zinnsatz;
	}

	public double getKontostand() {
		return kontostand;
	}
	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}
}
