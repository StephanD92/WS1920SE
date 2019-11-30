package GrafikProgramm;

import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdIn;
import java.util.*;
import javax.swing.*;

public class GrafikMain {

	public static void main(String[] args) {
		
		StdDraw.setXscale(0, 30);
		StdDraw.setYscale(0, 30);
		Figur[] figuren = new Figur[4];
		figuren[0] = new Rechteck(5, 5, 2, 4);
		figuren[1] = new Quadrat(10, 10, 3);
		figuren[2] = new Ellipse(15, 15, 1, 4);
		figuren[3] = new Kreis(20, 20, 3);
		for(Figur f: figuren) {
			f.setProperty("FARBE", "GREEN");
			f.setProperty("TEXT", "GREEN");
			f.zeichne();
		}
		
		
	}

}
