package de.galileocomputing.schroedinger.java.kapitel03;

public class PrimzahlForSchleife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=1;i<=100;i++) {
			boolean istPrimzahl = true;
			for(int b=2;b<i;b++) {
				if(i%(b*b) == 0) {
					istPrimzahl = false;
					break;
				}
			}
			if(istPrimzahl) {
				System.out.println(i);
		}
		
		}
		
		
	}

}
