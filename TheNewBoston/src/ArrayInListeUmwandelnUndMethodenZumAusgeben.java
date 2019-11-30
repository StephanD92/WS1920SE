import java.util.*;

public class ArrayInListeUmwandelnUndMethodenZumAusgeben {

	// create array and convert to list
	
	public static void main(String[] args) {
		
		Character[] ray = {'p','e','W','a'};  // array erstellen
		List<Character> l = Arrays.asList(ray);  // array in liste konvertieren
		
		System.out.println("Liste ist: ");
		ausgeben(l);
		
//		ausgabe(1);
		
		// methode von Collection class aufrufen
		// die liste reverese ausgeben
		Collections.reverse(l);
		System.out.println();
		System.out.println("Liste andersrum ist: ");
		ausgeben(l);
		
		
		// create new Array and new list
		Character[] newRay = new Character[4];
		List<Character> kopieDerListe = Arrays.asList(newRay);
		// leere Liste mit 3 elemente also gleicher Größe wie erste liste
		
		//inhalt der ersten liste in neueList reinkopieren
		System.out.println();
		Collections.copy(kopieDerListe, l);
		System.out.println("Kopie der Liste: ");
		ausgeben(kopieDerListe);
		
		
		
		
		// Collection mit Shit füllen
		// Methode füllt Liste komplett mit dem Shit den wir ihr geben (X)
		System.out.println();
		Collections.fill(l, 'X');
		System.out.println("Liste L nach Füllung mit Zeug ist: ");
		ausgeben(l);
		
		
		System.out.println();
		System.out.print("Nochmal nutzen der Ausgaben Methode weil es so schön ist");
		System.out.println();
		ausgeben(kopieDerListe);
		
	}
	
	// ausgabe Methode
	private static void ausgeben(List<Character> thelist) {
		for (Character x: thelist)
	      System.out.printf("%s ",x);
	}
	
}
