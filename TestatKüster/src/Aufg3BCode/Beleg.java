package Aufg3BCode;
import java.util.*;
/**
 * @author Stephan D
 * @version 1.0
 * @created 15-Jun-2019 21:39:08
 */
public class Beleg {

	protected String beschreibung;
	protected int kosten;

	public void finalize() throws Throwable {

	}
	
	public Beleg(String beschreibung, int kosten){
		this.beschreibung = beschreibung;
		this.kosten = kosten;
	}

	public void ausgeben()
		
	{

	}
}//end Beleg