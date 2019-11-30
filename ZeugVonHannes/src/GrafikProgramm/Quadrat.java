package GrafikProgramm;

import java.util.HashMap;

public class Quadrat extends Rechteck {

	public Quadrat(int xcord, int ycord, HashMap<String, String> map, int k) {
		super(xcord, ycord, map, k, k);
		// TODO Auto-generated constructor stub
	}

	public Quadrat(int xcord, int ycord, int k) {
		super(xcord, ycord, k, k);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Quadrat [k=" + this.getH() + "] " + " xcord:" + this.getXcord() + " ycord:" +this.getYcord();
	}
	
	
	
}
