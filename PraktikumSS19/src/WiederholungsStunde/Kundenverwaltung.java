package WiederholungsStunde;

import java.util.List;
import java.util.*;

public class Kundenverwaltung {

	public static void main(String[] args) {
		
		List<Kunde> kunden = new ArrayList<Kunde>();
		kunden.add(new Kunde(5,"Meier",false));
		kunden.add(new Kunde(15,"Wille",true));
		kunden.add(new Kunde(53,"Günther",false));
		kunden.add(new Kunde(25,"Otto",true));
		kunden.add(new Kunde(45,"Jäger",true));
		
		Kunde k1 = new Kunde(44,"Peter",false);
		kunden.add(k1);
		
		
		
		// müssen wir auch können in klausur. For each schleife
		for(Kunde k : kunden)
			System.out.println(k);
		
		Collections.sort(kunden);
		System.out.println("sortiert:");
		
		
		for(Kunde k : kunden)
			System.out.println(k);
		System.out.println();
		
		System.out.println(kunden.get(2));
		
	}

}
