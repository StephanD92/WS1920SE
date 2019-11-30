package Übungsblatt02verbessert;

import java.util.*;

import edu.princeton.cs.introcs.StdDraw;

public class TestFigur {

	public static void main(String[] args) {
		StdDraw.setXscale(0,20);
		StdDraw.setYscale(0,20);
		//Kreis kreis = new Kreis (4,5,4,5,4);
		//Quadrat quadrat = new Quadrat (4,4,4);
		//Quadrat quadrat = new Quadrat (4,4,4);
		ArrayList<Figur> figuren = new ArrayList<Figur>();
		
		
		figuren.add(new Rechteck (4,4,4,7));
		figuren.add(new Ellipse (13,14,9,3));
		figuren.add(new Kreis (4,14,6));
		figuren.add(new Quadrat (13,4,4));
		
		figuren.get(0).getEigenschaften().put("Jannik","Jannik");
	    figuren.get(1).getEigenschaften().put("Jannik","Feierabend");
	    figuren.get(2).getEigenschaften().put("Jannik","Ende");
	    figuren.get(3).getEigenschaften().put("Jannik","Party");
		for (Figur f : figuren) {
			System.out.println(f);
			f.zeichne();
		}
		
		

	}

}
