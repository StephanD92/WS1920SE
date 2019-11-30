package Übungsblatt02verbessert;

import java.util.*;

public abstract class Figur {
	
	private int xKoordinate; 
	private int yKoordinate;
	private int breite;
	private int hoehe;
	protected HashMap<String, String>eigenschaften;
	
	
	public Figur(int xKoordinate, int yKoordinate, int breite, int hoehe) {
		super();
		this.xKoordinate = xKoordinate;
		this.yKoordinate = yKoordinate;
		this.breite = breite;
		this.hoehe = hoehe;
		this.eigenschaften=new HashMap<String,String>();
	}
	

	public HashMap<String, String> getEigenschaften() {
		return eigenschaften;
	}
	
	
	
	
	public int getxKoordinate() {
		return xKoordinate;
	}
	public void setxKoordinate(int xKoordinate) {
		this.xKoordinate = xKoordinate;
	}
	
	
	
	public int getyKoordinate() {
		return yKoordinate;
	}
	public void setyKoordinate(int yKoordinate) {
		this.yKoordinate = yKoordinate;
	}
	
	
	
	public int getBreite() {
		return breite;
	}
	public void setBreite(int breite) {
		this.breite = breite;
	}
	
	
	
	public int getHoehe() {
		return hoehe;
	}
	public void setHoehe(int hoehe) {
		this.hoehe = hoehe;
	}
	
	
	
	public String toString() {
		return "Wert der Figur: "  + eigenschaften;
	}
	
	abstract void zeichne();   // muss abstract sein

}
