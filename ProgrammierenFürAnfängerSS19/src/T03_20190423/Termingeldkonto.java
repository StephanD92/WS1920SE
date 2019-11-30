package T03_20190423;

public class Termingeldkonto extends Geldanlage{

	private double mindestanlage;

	public Termingeldkonto(String inhaber, int kontonr, double zinnsatz, double kontostand, int laufzeit, double mindestanlage) {
		super(inhaber, kontonr, zinnsatz, kontostand, laufzeit);
		this.mindestanlage = mindestanlage;
	}
	
	
	
}
