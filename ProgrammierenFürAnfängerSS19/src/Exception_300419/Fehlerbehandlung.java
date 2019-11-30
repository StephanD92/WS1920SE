package Exception_300419;

public class Fehlerbehandlung {

	public static void main(String[] args) {
		
	
		String wert = "123!";
		
		try { 
			int i = Integer.parseInt(wert);
		} catch (NumberFormatException nfe) {
			System.err.println ("Fehler bei Umwandlung!\nFehlermeldung: " + nfe.getMessage());
			System.out.println();
			nfe.printStackTrace();	
		}	
		System.out.println("Programm lauft wieder....");
	}
	
	public static int getWert(String wert) throws NumberFormatException  {
		return Integer.parseInt(wert);
	}

}
