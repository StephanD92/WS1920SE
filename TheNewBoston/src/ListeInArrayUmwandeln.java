import java.util.Arrays;
import java.util.*;
public class ListeInArrayUmwandeln {

	public static void main (String[] args) {
		
		String [] stuff = {"Kefir","Buttermilch","Steak","Würstchen"};
		LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));
		
//		Arrays.asList(stuff); // schaut sich stuff an als wäre es eine Liste
		thelist.add("neuDazugekommen");
		thelist.addFirst("erstes");
//		thelist.remove(2); // löscht element an stelle 2
		
		stuff = thelist.toArray(new String[thelist.size()]);
		
		int [] intstuff = {1,2,3,4,5,6,7,8};
		
		for (int x : intstuff)
			System.out.printf("%s ",x);
		
		// ausgabe
//		for (String x: thelist)
//			System.out.printf("%s ",x);
		//ausgabe Array
//		for(int i=0; i<stuff.length; i++) {
//			System.out.printf("%s ",stuff[i]);
//		}
		for (String x: stuff)
			System.out.printf("%s ",x);
		//ausgabe Liste
//		for(int i=0; i<thelist.size(); i++) {
//			System.out.printf("%s ",thelist.get(i));
//		}
		
	}
	
}
