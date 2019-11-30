import java.util.*;


public class HashSetIntroduction {

	public static void main(String[] args) {
		
		String [] zeug2 = {"Bob","Micha","Danilo","Micha","Bob","Simon"};
		List<String> zeugListe2 = Arrays.asList(zeug2);
		
		String[] zeug = {"Apfel", "Birne","Banane","Apfel", "Kirsche","Banane"};
		// erstelle Liste und gibt ihr das String Array zeug
		List<String> zeugListe = Arrays.asList(zeug);
		
		// geb die Liste zeugliste aus
		System.out.println("Ausgabe Mit duplikaten");
		System.out.println(zeugListe);
		System.out.println();
		
		// erstelle ein Set (Hashset) und überge dem Set die Liste zeugliste
		Set<String> set = new HashSet<String>(zeugListe);
		System.out.println("Ausgabe nach Übergabe in Hashset (ohne Duplikate):");
		System.out.printf("%s ",set);  //ausgabe der Liste
		
		System.out.println();
		System.out.println();
		System.out.println("neues Array mit duplikaten");
		System.out.printf("%s ",zeugListe2);
		System.out.println();
		
		Set<String> set2 = new TreeSet<String>(zeugListe2);
		System.out.println();
		System.out.println("Ausgabe des zweiten Sets (TreeSet) wieder ohne Duplikate:");
		System.out.println(set2);
		
		
	}
}
