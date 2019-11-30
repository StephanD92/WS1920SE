package Navigationssoftware;

public class Strasse {
	private String name;
	private int laenge;
	private Stadt stadt1;
	private Stadt stadt2;
	public Strasse(String name, int laenge, Stadt i, Stadt o) {
		this.name = name;
		this.laenge = laenge;
		this.stadt1 = i;
		this.stadt2 = o;
		this.stadt1.addStrasse(this);
		this.stadt2.addStrasse(this);
	}
	public String toString() {
		return this.name + "   " + this.stadt1.getName() + "   " + this.stadt2.getName() + "    " + this.laenge;
	}
	public Stadt getStadt1() {
		return this.stadt1;
	}
	public Stadt getStadt2() {
		return this.stadt2;
	}
	
	
}
