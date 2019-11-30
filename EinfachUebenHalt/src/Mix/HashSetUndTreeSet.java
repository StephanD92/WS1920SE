package Mix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetUndTreeSet {

	
	public static void main(String[] args) {
		
	String[] zeug = {"nille","Peter","nille", "hans","willi","hans"};
	
	List<String> zeugliste = Arrays.asList(zeug);

	Set<String> set = new HashSet<String>(zeugliste);
	
	for(String x:set)
		System.out.printf("%s ",x);
	System.out.println();
	System.out.println("Treeset:");
	
	Set<String> set2 = new TreeSet<String>(zeugliste);
	
	
	for(String x: set2)
		System.out.printf("%s ",x);
	
	}
	
}
