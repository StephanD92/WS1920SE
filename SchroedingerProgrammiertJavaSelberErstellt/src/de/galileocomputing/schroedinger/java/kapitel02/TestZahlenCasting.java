package de.galileocomputing.schroedinger.java.kapitel02;

public class TestZahlenCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	short zahl = 129;	
	byte kleinesByte = (byte) zahl; 
	System.out.println(kleinesByte);
	/* Byte kann 129 nicht darstellen (128 ist größtmögliche Darstellung) somit fängt er wieder von von
	 * vorne an (ergebnis -127)
	 */
	
	/* Casting. ein Int in ein long zu pressen muss explizit angegeben werden. nicht alle wertebereiche von int
	 * passen in long rein. somit können wir daten verlieren. weiteres beispiel
	 * 
	 */
	long l = 2147483650345L;  //das L nicht vergessen, sonst macht er Int und meckert
	int kleiner = (int) l; // die long zahl l wird als int gecastet und verliert genauigkeit, weil int den L wert
	// nicht darstellen kann
	System.out.println(kleiner);
	
		
	}

}
