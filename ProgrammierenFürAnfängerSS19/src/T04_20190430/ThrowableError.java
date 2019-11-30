package T04_20190430;

public class ThrowableError {

	public static void main(String[] args) {
String wert = "123!";
		
		try {
			int i = getWert(wert);
		}catch(NumberFormatException nfe) {
			System.err.println("Fehler bei Umwandlung in eine ganze Zahl!\nFehlermeldung: " + nfe.getMessage());
			System.out.println();
			nfe.printStackTrace();
		}

	}
	
	public static int getWert(String wert) throws NumberFormatException{
		return Integer.parseInt(wert);
	}

}
