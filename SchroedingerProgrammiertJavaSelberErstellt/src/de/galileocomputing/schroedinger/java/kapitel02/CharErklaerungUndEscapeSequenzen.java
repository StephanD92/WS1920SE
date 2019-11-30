package de.galileocomputing.schroedinger.java.kapitel02;

public class CharErklaerungUndEscapeSequenzen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Char ist primitiver Datentyp 2 byte zur Verf�gung und kann 65.536 Werte darstellen. So viele Tasten
		 * haben wir aber nicht auf der Tastatur, somit werden die werte in Zeichentabellen/Encodings gespeichert
		 * werden intern durch vorzeichenlose Dezimalzahlen repr�sentiert. Jedem Zeichen ist also eine Zahl
		 * in der Tabelle zugeordnet und ein zeichen l�sst sich unterschiedlich aufrufen:
		 */
		
		char c ='S'; 		// direkt ausgabe des Zeichen mit einfachen 'Zeichen'
		char s = '\u0053'; 	// Unicode der Stelle
		char t = 0x0053; 	//hexadezimalwert der Stelle
		char u = 83; 		//dezimalzahl der Stelle
		
		System.out.println(c);
		System.out.println(s);
		System.out.println(t);
		System.out.println(u);
		
		/*Probleme kann es bei bestimmten ausgaben geben wie z.B. dem Ausgeben von  einem einfachen '
		* Hier denkt das char bei der Schreibweise ''' das Zeichen h�rt beim zweiten ' auf. Deswegen brauchen
		* wir Escape Sequenzen Bsp:
		*/
		// Fehler: char einfacheAusfuerungszeichen = ''';
		char einfacheAusfuehrungszeichen = '\'';
		System.out.println(einfacheAusfuehrungszeichen);
		
		/* wichtigste Escape-Sequenzen: 
		 	- \t   simulation Tabulatorzeichen
		 	- \n	Zeile einf�gen
		 	- \' 	einf�gen Anf�hrungszeichen
		 	- \"	setzen doppeltes Anf�hrungszeichen
		 	- \\	verwendung von \
		 */
		
	}

}
