package Übungsblatt02;

public abstract class Elipse extends Figur {

	private double breite;
	private double hoehe;
	
	public Elipse(double xKoordinate, double yKoordinate,double breite, double hoehe) {
		super(xKoordinate, yKoordinate);
		this.breite = breite;
		this.hoehe = hoehe;
	}

	public double getBreite() {
		return breite;
	}
	public void setBreite(double breite) {
		this.breite = breite;
	}

	public double getHoehe() {
		return hoehe;
	}
	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}
	
	
	
	
	

}
