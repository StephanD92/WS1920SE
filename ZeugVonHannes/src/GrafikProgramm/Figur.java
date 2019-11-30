package GrafikProgramm;

import java.util.HashMap;
import java.util.Map;

import edu.princeton.cs.introcs.StdDraw;

public abstract class Figur {
	protected int xcord;
	protected int ycord;
	private Map<String, String> properties = new HashMap<String, String>();
	
	public Figur(int xcord, int ycord, HashMap<String, String> map) {
		this.xcord = xcord;
		this.ycord = ycord;
		this.properties = map;
	}
	
	public Figur(int xcord, int ycord) {
		this.xcord = xcord;
		this.ycord = ycord;
	}
	
	public void setProperty(String k, String v) {
		this.properties.put(k, v);
	}
	
	public String getProperty(String s) {
		if(this.properties.containsKey(s))
			return this.properties.get(s);
		return null;
	}

	public int getXcord() {
		return xcord;
	}

	public void setXcord(int xcord) {
		this.xcord = xcord;
	}

	public int getYcord() {
		return ycord;
	}

	public void setYcord(int ycord) {
		this.ycord = ycord;
	}
	
	public String toString() {
		return " xcord:" + this.xcord + " ycord:" + this.ycord + this.properties.values();
	}
	
	abstract public void zeichne();
	
	public void PenColor() {
		String color = this.getProperty("FARBE");
		switch (color) {
			case "BLUE":	StdDraw.setPenColor(StdDraw.BLUE);
							break;
			case "RED":		StdDraw.setPenColor(StdDraw.RED);
							break;
			case "GREEN":	StdDraw.setPenColor(StdDraw.GREEN);
							break;
			default:		StdDraw.setPenColor();
							break;
		}
			
		
	}
	public void textZeichnen() {
		StdDraw.setPenColor();
		String text = getProperty("TEXT");
		if (text != null)
			StdDraw.text(this.xcord, this.ycord, text);
	}
	
}
