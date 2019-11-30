package Übungsblatt02verbessert;

public class Kreis extends Ellipse {
	private int radius;
	
	public Kreis(int xKoordinate, int yKoordinate, int radius) {
		super(xKoordinate, yKoordinate,radius, radius);
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return super.toString() + "Die Spezialisierung ist ein Kreis mit dem Radius: " + radius + ".";
	}
	
}
