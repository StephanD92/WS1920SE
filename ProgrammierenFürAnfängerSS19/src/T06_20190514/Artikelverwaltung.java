package T06_20190514;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;



public class Artikelverwaltung {

	public static void main(String[] args) {
		
		Artikel a1 = new Artikel(10,"Brötchen",0.59);
		Artikel a2 = new Artikel(15,"Wurst",1.29);
		Artikel a3 = new Artikel(8,"Mundspülung",4.89);
		Artikel a4 = new Artikel(22,"Kaugummis",2.29);
	
		LinkedList<Artikel> Artikelliste = new LinkedList<Artikel>();
		Artikelliste.add(a1);
		Artikelliste.add(a2);
		Artikelliste.add(a3);
		Artikelliste.add(a4);
		
		for(Artikel x : Artikelliste)
			System.out.println(x);
		
		Collections.sort(Artikelliste);
		
		System.out.println();
		for(Artikel x : Artikelliste)
			System.out.println(x);
//		System.out.println(a1.compareTo(a2));
//		System.out.println(a1.toString());
	}

	

	
}
