package Kapitel25ObjekteUndKlassen;

public class StringTester {

	public static void main(String[] args) {
	
		String str;    
		// String str verweist auf das Objekt str nachdem das Objekt str durch new operator erzeugt 
		// wurde. davor war es nur ein Platzhalter
		int laengeString;
		int str2;
		int laengeInt;
		str = new String("Buschbachweg");   //Erzeuge Objekt vom Typ String
		str2 = new Integer(5);
		
		
		laengeString = str.length();   // rufe methode aus die L‰nge von Str feststellt und diese abspeichert in integer lanege
		System.out.println("Die Bezeichnung der Straﬂe ist "+laengeString+ " Zeichen lang");
		System.out.println(str2);
	}

}
