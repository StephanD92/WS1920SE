package de.galileocomputing.schroedinger.java.kapitel03;

public class SchleifenBeispielLiegestützen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//For-Schleife
		for (int f = 0; f < 50; f++) {
			System.out.println("LiegestützFor: "+(f+1));
		}
		
		// while-Schleife
		int w = 0;
		while (w<50) {
			System.out.println("LiegestützWhile: "+(++w));
		}
		
		// do-while-Schleife
		int dw = 0;
		do {
			System.out.println("LiegestützDoWhile:"+(++dw));
		} while (dw<50);
		
		
	}

}
