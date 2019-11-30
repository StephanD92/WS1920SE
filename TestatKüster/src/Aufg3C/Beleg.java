package Aufg3C;

import java.util.*;


public class Beleg {

	protected String beschreibung;
	protected int kosten;

	public Beleg(String beschreibung, int kosten){
		this.beschreibung = beschreibung;
		this.kosten = kosten;
	}

//	public String getBeschreibung() {
//		return beschreibung;
//	}	
//	public void setBeschreibug(String beschreibung) {
//		this.beschreibung = beschreibung;
//	}
//	public int getKosten() {
//		return kosten;
//	}
//	public void setKosten(int kosten) {
//		this.kosten = kosten;
//	}
		
	
	public void ausgeben(){
		System.out.print(beschreibung+" "+kosten+"€ ");
	}
	
}//end Beleg