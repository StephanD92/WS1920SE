package de.galileocomputing.schroedinger.java.kapitel03;

public class SchleifenSchachtelungFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		�u�ere Schleife z�hlt S�tze. Innerhalb des Satzes wird z.B. auf 25 hochgez�hlt und dann 
		in den n�chsten Satz gewechselst bis 5 S�tze fertig sind
		*/
		
		
		for (int i=1; i<=5; i++) {
			System.out.println("Satz: "+i);
			System.out.println();
			for(int r=1; r<=15;r++) {
				System.out.println("Liegest�tz-Nr: "+r);
			}
			System.out.println();
			System.out.println();
		}
		
		
		for (int b=1;b<=5;b++) {
			System.out.print(b);
			System.out.println(". Runde - auf gehts");
			for(int c=1;c<=25;c++) {
				System.out.print(c);
				System.out.println(".Liegest�tz");
			}
		}
		
	}

}
