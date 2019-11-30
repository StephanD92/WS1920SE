package Aufg3BCode;

/**
 * @author Stephan D
 * @version 1.0
 * @created 15-Jun-2019 21:39:08
 */
public class Ticket extends Beleg {

	private String nach;
	private String typ;
	private String von;

	public Ticket(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 * 
	 * @param beschreibung
	 * @param kosten
	 * @param typ
	 * @param von
	 * @param nach
	 */
	public void Ticket(String beschreibung, int kosten, String typ, String von, String nach){

	}

	public void ausgeben(){

	}

	/**
	 * 
	 * @param beschreibung
	 * @param kosten
	 */
	public Beleg(String beschreibung, int kosten){

	}
}//end Ticket