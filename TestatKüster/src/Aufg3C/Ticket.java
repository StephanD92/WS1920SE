package Aufg3C;

/**
 * @author Stephan D
 * @version 1.0
 * @created 15-Jun-2019 21:39:08
 */
public class Ticket extends Beleg {

	private String nach;
	private String typ;
	private String von;

	public Ticket(String beschreibung, int kosten, String typ, String von, String nach){
		super(beschreibung,kosten);
		this.typ = typ;
		this.von = von;
		this.nach = nach;
	}
	
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public String getVon() {
		return von;
	}
	public void setVon(String von) {
		this.von = von;
	}
	public String getNach() {
		return nach;
	}
	public void setNach(String nach) {
		this.nach = nach;
	}


	public void ausgeben(){
		super.ausgeben();
		System.out.println("[Details:"+typ+", von:"+von+", nach:"+nach+"]");
	}

	/**
	 * 
	 * @param beschreibung
	 * @param kosten
	 */
	
}//end Ticket