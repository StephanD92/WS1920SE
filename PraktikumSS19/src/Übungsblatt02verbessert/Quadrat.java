package Übungsblatt02verbessert;

public class Quadrat extends Rechteck {
	private int kantenlaenge;
	
	public Quadrat(int xKoordinate, int yKoordinate, int kantenlaenge) {
		super(xKoordinate, yKoordinate, kantenlaenge, kantenlaenge);
		this.kantenlaenge= kantenlaenge;
	}
	public int getKantenlaenge() {
		return kantenlaenge;
	}
	public void setKantenlaenge(int kantenlaenge) {
		this.kantenlaenge = kantenlaenge;
	}
	public String toString () {
		return super.toString() + "Die Spezialisierung Quadrat hat die Kantenlänge: " + this.kantenlaenge; 
	}
}
