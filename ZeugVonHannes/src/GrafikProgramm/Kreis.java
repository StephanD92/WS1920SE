package GrafikProgramm;

import java.util.HashMap;

public class Kreis extends Ellipse {
	
	private int r;
	
	public Kreis(int xcord, int ycord, HashMap<String, String> map, int r) {
		super(xcord, ycord, map, r*2, r*2);
		this.r = r;
	}

	public Kreis(int xcord, int ycord, int r) {
		super(xcord, ycord, r, r);
	}

	@Override
	public String toString() {
		return "Kreis [r=" +this.getH() + "]" + " xcord:" + this.getXcord() + " ycord:" + this.getYcord();
	}
	
}
