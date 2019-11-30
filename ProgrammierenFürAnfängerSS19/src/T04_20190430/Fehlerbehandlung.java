package T04_20190430;

public class Fehlerbehandlung {

	public static void main (String[] args) {
		
		String wert = "123!";
		
		try {
			int i = Integer.parseInt(wert);
		}catch(NumberFormatException nfe) {
			System.err.println("Fehler bei Umwandlung in eine ganze Zahl!\nFehlermeldung: " + nfe.getMessage());
			System.out.println();
			nfe.printStackTrace();
		}
	}
}
