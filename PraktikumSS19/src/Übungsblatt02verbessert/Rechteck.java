package Übungsblatt02verbessert;
//import java.util.HashMap;

import edu.princeton.cs.introcs.StdDraw;

public class Rechteck extends Figur {

	public Rechteck(int xKoordinate, int yKoordinate,  int hoehe, int breite) {
		super(xKoordinate, yKoordinate, breite, hoehe);
		
	}
	public String toString () {
		return super.toString() + ". Es handelt sich um ein Rechteck. ";
	}
	
	@Override
	void zeichne() {
		StdDraw.rectangle(getxKoordinate(), getxKoordinate(), getBreite()/2, getHoehe()/2);
		if(getEigenschaften().containsKey("Jannik")) {
			StdDraw.text(getxKoordinate(),getxKoordinate(), getEigenschaften().get("Jannik")); ;
		}
		
		
		
	}
	

}
