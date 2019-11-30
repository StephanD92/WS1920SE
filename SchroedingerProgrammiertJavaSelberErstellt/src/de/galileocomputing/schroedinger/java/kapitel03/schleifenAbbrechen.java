package de.galileocomputing.schroedinger.java.kapitel03;

public class schleifenAbbrechen {

	public static void main(String[] args) {
		
		int suchzahl = 5;
		
		for (int i=0; i<args.length;i++) {
			int zahl = Integer.parseInt(args[i]);
			if (zahl % suchzahl !=0) {
				System.out.println(zahl+ "nicht teilbar durch" + suchzahl);
				continue;
			}
			if (zahl == suchzahl) {
				System.out.println(suchzahl +"gefunden an Stelle "+ (i+1));
				break;
			}
		}	
	}
}

