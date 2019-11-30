import java.util.*;

public class ArrayListErkl‰rung {

	public static void main(String[] args) {
		
		// String Array und Array list erzeugen
		String[] zeug = {"fuﬂball","Stift","tennisball","lineal","wacken", "nille"};
		List<String> liste1 = new ArrayList<String>();
	
		//add Array items to list
		//String Array in Array List reinschreiben
		for (String x: zeug) 
		liste1.add(x);
	
		// nochmal String Array und Array List erstellen
		String[] mehrZeug = {"Kugelschreiber", "geodreieck","fuﬂball","Stift","Keks","tennisball","nille"};
		List<String> liste2 = new ArrayList<String>();
	
		// nochmal String Array in Array List reinschreiben
		for (String y: mehrZeug)
		liste2.add(y);
	
		// ausgeben
		// Liste1 ausgeben. Die Array List
		System.out.println("Liste1 vor dem Bearbeiten:");
		
		for (int i=0; i<liste1.size(); i++) { 
		System.out.printf("%s ", liste1.get(i));
		}
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("Liste2 zum Vergleich:");
		for (int i=0; i<liste2.size(); i++) { 
			System.out.printf("%s ", liste2.get(i));
		}
		
		
		// methode listebearbeiten angewendet und liste1 und liste2 als parameter ¸bergeben
		listebearbeiten(liste1,liste2);
		System.out.println();
		System.out.println();
		// liste1 wird nach dem bearbeiten durch die Methode erneut ausgegeben
		System.out.println("Liste 1 nach dem bearbeiten:");
		for (int i=0; i<liste1.size(); i++) { 
			System.out.printf("%s ", liste1.get(i));
		}
	
	
	
	}
	// Methode die 2 Listen ¸bergeben bekommt und vergleicht
	// wenn elemente der Liste1 auch in liste2 vorkommen, werden sie aus Liste1 entfernt
	public static void listebearbeiten(Collection<String> l1, Collection<String> l2) {
		Iterator<String> it = l1.iterator();  // ertellen iterator der durch l1 geht
		while (it.hasNext()) {					// iterator geht bis ans Ende von liste1		
			if(l2.contains(it.next()))			// wenn Itemms von l2 sich in l1 befinden
					it.remove();				// entfernen item von l1
		}
	}
	
}