package Übungsblatt02;

public abstract class Rechteck extends Figur {

	
	private double hoehe;
	private double breite;
	

	public Rechteck(double xKoordinate, double yKoordinate, double hoehe, double breite) {
		super(xKoordinate, yKoordinate);
		this.hoehe = hoehe;
		this.breite = breite;
	}
	public double getHoehe() {
		return hoehe;
	}
	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}

	
	public double getBreite() {
		return breite;
	}
	public void setBreite(double breite) {
		this.breite = breite;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
