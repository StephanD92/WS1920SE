package Übungsblatt02;

public abstract class Kreis extends Elipse {

	private double radius;

	public Kreis(double xKoordinate, double yKoordinate, String autor, String farbe, String text, String kommentar,
			double breite, double hoehe, double radius) {
		super(xKoordinate, yKoordinate);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	
	
	
	
}
