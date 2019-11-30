package Übungsblatt02verbessert;

import edu.princeton.cs.introcs.StdDraw;

public class Ellipse extends Figur {

	public Ellipse(int xKoordinate, int yKoordinate, int breite, int hoehe) {
		super(xKoordinate, yKoordinate, breite, hoehe);
		
	}
	public String toString () {
		return super.toString() + ". Es handelt sich um eine Ellipse. ";
	}
	@Override
	void zeichne() {
		StdDraw.ellipse(getxKoordinate(), getxKoordinate(), getBreite()/2, getHoehe()/2);
		if(getEigenschaften().containsKey("Jannik")) {
			StdDraw.text(getxKoordinate(),getxKoordinate(), getEigenschaften().get("Jannik")); ;
		}
	}

}
