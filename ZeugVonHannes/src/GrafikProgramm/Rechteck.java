package GrafikProgramm;

import java.util.HashMap;

import edu.princeton.cs.introcs.StdDraw;

public class Rechteck extends Figur {

	private int h;
	private int b;
	public Rechteck(int xcord, int ycord, HashMap<String, String> map, int h, int b) {
		super(xcord, ycord, map);
		this.h = h;
		this.b = b;
	}

	public Rechteck(int xcord, int ycord, int  h, int b) {
		super(xcord, ycord);
		this.h = h;
		this.b = b;
		
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Rechteck [h=" + h + " b=" + b + "] " + super.toString();
	}
	
	public void zeichne () {
		this.PenColor();
		StdDraw.rectangle(this.getXcord(), this.getYcord(), this.h/2, this.b/2);
		super.textZeichnen();
	}
	
	
	
	
	
}