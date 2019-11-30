package Aufg3C;

import java.util.*;

/**
 * @author Stephan D
 * @version 1.0
 * @created 15-Jun-2019 21:39:08
 */
public class Reiseabrechnung {

	private int mitarbeiterNr;
	private int reiseNr;
	public HashSet <Beleg> belege;

	
	public Reiseabrechnung(int mitarbeiterNr, int reiseNr){
		this.mitarbeiterNr = mitarbeiterNr;
		this.reiseNr = reiseNr;
		belege = new HashSet<Beleg>();
	}
	
	
	public HashSet<Beleg> getBelege() {
		return belege;
	}
	public void setBelege(HashSet<Beleg> belege) {
		this.belege = belege;
	}

	public int getMitarbeiterNr() {
		return mitarbeiterNr;
	}

	public void setMitarbeiterNr(int mitarbeiterNr) {
		this.mitarbeiterNr = mitarbeiterNr;
	}
	
	public int getReiseNr() {
		return reiseNr;
	}
	public void setReiseNr(int reiseNr) {
		this.reiseNr = reiseNr;
	}

	
	public void ausgeben(){
		System.out.println("Reise Nr."+reiseNr+" von Mitarbeiter "+mitarbeiterNr);
		for(Beleg x: belege)
			x.ausgeben();
		System.out.println();
	}

	public void belegeHinzufuegen(Beleg beleg){
		belege.add(beleg);
	}

	public int gesamtSumme(Beleg beleg){
		int summe = 0;
		for (Beleg x :belege)
			summe += x.kosten;
		return summe;
	}
	
}//end Reiseabrechnung