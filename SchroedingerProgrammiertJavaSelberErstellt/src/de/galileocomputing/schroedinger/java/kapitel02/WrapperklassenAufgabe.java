package de.galileocomputing.schroedinger.java.kapitel02;

public class WrapperklassenAufgabe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Schreibe ein Programm, das für eine beliebiege Nichtkommazahl ausgibt, ob die Zahl im Wertebereich
		// von byte,short,int oder long liegt. Nutze dazu Methoden und Felder der Wrapperklassen
		
		Long zahl = Long.parseLong(args[0]);  // fest Zahl mit run Configuration gespeichert
		//Long zahl = (long)123456789144L;
		System.out.println(zahl + " passt in Long Wertebereich: " + (zahl>= Long.MIN_VALUE && 
				zahl<=Long.MAX_VALUE));
		System.out.println(zahl + " passt in int Wertebereich: "+ (zahl<= Integer.MAX_VALUE && 
				zahl >= Integer.MIN_VALUE));
		System.out.println(zahl + " passt in short Wertebereich: "+ (zahl >=Short.MIN_VALUE && 
				zahl <= Short.MAX_VALUE));
		System.out.println(zahl + " passt in Byte Wertebereich: " + (zahl >=Byte.MIN_VALUE && 
				zahl <= Byte.MAX_VALUE));
		System.out.println();
		System.out.println();
		
		
		long zahl2 = 11125943453333L;
		System.out.println(zahl2 + " passt in Long Wertebereich: " + (zahl2>= Long.MIN_VALUE && 
				zahl2<=Long.MAX_VALUE));
		System.out.println(zahl2 + " passt in int Wertebereich: "+ (zahl2<= Integer.MAX_VALUE && 
				zahl >= Integer.MIN_VALUE));
		System.out.println(zahl2 + " passt in short Wertebereich: "+ (zahl2 >=Short.MIN_VALUE && 
				zahl2 <= Short.MAX_VALUE));
		System.out.println(zahl2 + " passt in Byte Wertebereich: " + (zahl2 >=Byte.MIN_VALUE && 
				zahl2 <= Byte.MAX_VALUE));
		
	}

}
