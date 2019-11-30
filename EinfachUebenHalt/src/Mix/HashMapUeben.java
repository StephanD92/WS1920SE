package Mix;
import java.util.*;

public class HashMapUeben {


	public static void main(String[] args) {
		
	
		// map ist immer Key,Value
		HashMap<String, Boolean> map1 = new HashMap<>();
		// hinzufügen
		map1.put("Peter", true);
		map1.put("Jochen",false);
		map1.put("Ghuenther",true);
		// get values
		map1.get("Peter");
		// in zeile holen und gleich ausgeben
		
		// prüft on jack ein key der map ist
//		if(map1.containsKey("jack"))System.out.println(1);
		
		
		System.out.println(map1.get("Peter"));
		System.out.println("erste Map:");
		// map1 ausgeben mit for each Statement
		System.out.println("Key ausgeben:");
		for(String s: map1.keySet())
			System.out.printf("%s ",s);
		
		
		System.out.println();
		// map ausgeben mit for each Statement
		
		
		System.out.println();
		
		
		System.out.println("Value ausgeben:");
		for(Boolean s: map1.values())
			System.out.printf("%s ",s);
		
		
//		System.out.println(map1);
//		System.out.println(map1.get("Peter"));
//		System.out.println(map1.get("Jochen"));
		
		
		
		TreeMap<String, Integer> map2 = new TreeMap<>();
		
		map2.put("Peter", 10);
		map2.put("Wacken",111);
		
//		System.out.println(map2.get("Peter"));
	
		
		
		HashMap<Boolean,String> map2andersrum = new HashMap<>();
		map2andersrum.put(true,"Pommes");
		map2andersrum.put(true,"Mayo");
		map2andersrum.put(true,"Pommes");
		
		
//		List<String> liste1 = new LinkedList<>();
//		liste1.add("Jochen");
//		liste1.add("Peter","Jochen");   geht nicht. immer nur ein Element
//		liste1.add("nochEinJochen");
//		liste1.add("Jochen");
//
//		// liste ausgeben mit for each Statement
//		for(String x: liste1)
//			System.out.printf("%s ",x);
//		
//		System.out.println();
		
		
	}
	
	
	
}
