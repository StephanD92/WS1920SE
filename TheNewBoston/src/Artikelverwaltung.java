import java.util.*;
public class Artikelverwaltung {

	public static void main(String[] args) {
		
		
		Artikel a1 = new Artikel(133,"Saft",5.99);
		Artikel a2 = new Artikel(54,"OSaft",5.99);
		Artikel a3 = new Artikel(6,"ArangenSaft",5.99);
		Artikel a4 = new Artikel(66,"JahooSaft",5.99);
		Artikel a5 = new Artikel(125,"ErbeerSaft",5.99);
		Artikel a6 = new Artikel(22,"HeilsamerSaft",5.99);
		
	
		LinkedList<Artikel> aliste = new LinkedList<Artikel>();
		
		aliste.add(a1);
		aliste.add(a2);
		aliste.add(a3);
		aliste.add(a4);
		aliste.add(a5);
		
		for (Artikel x: aliste)
			System.out.println(x);
		
//		Collections.sort(aliste);
//		Collections.shuffle(aliste);
		
		
		System.out.println("sortiert:");
		
		for (Artikel x: aliste)
			System.out.println(x);
		
		
		
	}

}
