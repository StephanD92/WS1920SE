import java.util.*;

public class AddAllCollectionMethode {

	public static void main(String[] args) {
		//Array erstellen
		String [] Obst = {"Banane","Apfel","Kiwi","Orange"};
		
		// liste erstellen und arrayDirekt reinschreiben
		List<String> liste1 = Arrays.asList(Obst);
		
		ArrayList<String> liste2 = new ArrayList<String>();
		liste2.add("Youtube");
		liste2.add("Google");
		liste2.add("Facebook");
		
		for(String x :liste2)
			System.out.printf("%s ",x);
		
		// Elemente von Obst in liste2 packen
		// er nimmt liste2 (Youtube,Google,Facebook) und packt alles vom Sring
		// Obst ans Ende der Liste mit dazu. Liste ist ja arrayist also dynamisch
		Collections.addAll(liste2, Obst);
		System.out.println();
		
		for(String x:liste2)
			System.out.printf("%s ",x);
		
		
		
	}
	
	
	
	
}
