package Übungsblatt02;

public abstract class Quadrat extends Rechteck {

	protected double kantenlänge;
	
	
	public Quadrat(double xKoordinate, double yKoordinate,
			double hoehe, double breite, double kantenlänge) {
		super(xKoordinate, yKoordinate, hoehe, breite);
		this.kantenlänge = kantenlänge;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
