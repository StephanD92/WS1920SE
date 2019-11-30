package Übungsblatt02;

import java.util.*;

public abstract class Figur {

	protected double xKoordinate;
	protected double yKoordinate;
	Map<String, String> map = new HashMap<String,String>();
	
	
	public Figur(double xKoordinate, double yKoordinate) {
		this.xKoordinate = xKoordinate;
		this.yKoordinate = yKoordinate;

	}

	abstract public void zeichne();
	

	
	
	@Override
	public String toString() {
		return "Figuren [xKoordinate=" + xKoordinate + ", yKoordinate=" + yKoordinate + "]";
	}




	public double getxKoordinate() {
		return xKoordinate;
	}
	public void setxKoordinate(double xKoordinate) {
		this.xKoordinate = xKoordinate;
	}
	public double getyKoordinate() {
		return yKoordinate;
	}

	public void setyKoordinate(double yKoordinate) {
		this.yKoordinate = yKoordinate;
	}

}
