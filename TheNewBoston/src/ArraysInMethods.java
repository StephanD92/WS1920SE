
public class ArraysInMethods {

	public static void main(String[] args) {
		
		
		int bucky[] = {1,2,3,4,5,6};
		change(bucky);
		
		for(int i:bucky)
			System.out.println(i);
	}
	
	// wir bauen eine Methode die als Parameter ein Array �bergeben bekommt
	public static void change(int x[]) {
	// wollen alle werte nehmen und z.B. 5 aufaddieren
	// for statement geht durch das Array was der methode �bergeben wird
	// es geht bis ans ende des Arrays(x.length)
	// w�hrend es durchgeht addiert es auf jeden wert 5 drauf.
	// wendet man die methode an so wird jeder wert des arrays +5 ge�ndert
		for(int i=0; i<x.length; i++)
			x[i]+=5;
	}

}
