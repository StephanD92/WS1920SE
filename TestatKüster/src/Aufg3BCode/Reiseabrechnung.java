package Aufg3BCode;
import java.util.*;

/**
 * @author Stephan D
 * @version 1.0
 * @created 15-Jun-2019 21:39:08
 */
public class Reiseabrechnung {

	private int mitarbeiterNr;
	private int reiseNr;
	private HashSet <Beleg> belege;

	public Reiseabrechnung(int manr, int reisenr){
		this.mitarbeiterNr = manr;
		this.reiseNr = reisenr;
		belege = new HashSet<Beleg>();

	}


	public void ausgeben(){

	}

	/**
	 * 
	 * @param beleg
	 */
	public void belegeHinzufuegen(Beleg beleg){

	}

	public int gestamtSumme(){
		return 0;
	}
}//end Reiseabrechnung