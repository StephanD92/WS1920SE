package Navigationssoftware;

import java.util.LinkedList;
import java.util.List;

public class Stadt {
	private String name;
	private LinkedList<Strasse> strassen = new LinkedList<Strasse>();
	public Stadt(String name) {
		this.name = name;
	}
	public void addStrasse(Strasse i) {
		strassen.add(i);
	}
	public void delStrasse(Strasse i) {
		strassen.remove(i);
	}
	public String getName() {
		return this.name;
	}
	public String toString() {
		return this.name + strassen.toString();
	}
	public LinkedList<Stadt> getNachbarstaedte() {
		LinkedList<Stadt> nachbarstaedte = new LinkedList<Stadt>();
		for (Strasse s: strassen) {
			if (s.getStadt1()==this) {
				nachbarstaedte.add(s.getStadt2());
			} else {
				nachbarstaedte.add(s.getStadt1());
			}
		}
		return nachbarstaedte;
		
	}
}
