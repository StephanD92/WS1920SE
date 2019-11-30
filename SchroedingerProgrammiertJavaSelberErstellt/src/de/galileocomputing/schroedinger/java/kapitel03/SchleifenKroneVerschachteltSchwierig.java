package de.galileocomputing.schroedinger.java.kapitel03;

public class SchleifenKroneVerschachteltSchwierig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int breite = 17;
		final int haelfteBreite = (breite-1)/2;
		final int hoehe = haelfteBreite;
		final int letzteReihe = hoehe-1;
		
		for (int i=0; i < hoehe; i++) {
			for (int j = 0; j < breite; j++) {
				switch(i) {
				case 0:
					System.out.print((j==0 || (j==haelfteBreite) || j==breite-1) ? "*" : " ");
					break;
				case letzteReihe:
					System.out.print(8);
					break;
				default:
					System.out.print((j<i || (j>haelfteBreite-i && j<haelfteBreite+i)
							|| j>=breite-i) ? 0 : " ");
					
				}
			}
			System.out.println();
		}
		
		
	}

}
