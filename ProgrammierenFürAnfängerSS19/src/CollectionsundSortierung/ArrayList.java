package CollectionsundSortierung;
import java.util.TreeMap;

import P01_AbstrakteKlassenUndInterfaces.Student;

public class ArrayList {

	
	public static void main(String[] args) {
		
	
	//Collection Framework
	int[] arr = new int[10];
	System.out.println(arr[2]+ "");
	arr[3] = 6;
	
	
	ArrayList<Integer> al = new ArrayList<Integer>();  //Integer muss groß sein, int geht NICHT. Hüllklassen!!!
	System.out.println(""+ al.get(2));
	al.add(3,6); // erster Wert ist index
	
	al.contains(7); // sucht nach (Objekt), also quasi ob 7 dort enthalten ist
	
	// LinkedList = verkette Liste. Funktioniert über Verweise in elementen
	
	
	//MAP: erzeugen
	// Treemap ist schon sortiert. Spalten sind Key und Value. Die Key spalte ist von haus aus sortiert
	// klasse die in <> KLammer steht muss sortierbar sein
	TreeMap<Integer,String> tm = new TreeMap<Integer, String>();
	tm.put(3, "Hallo"); // nicht wie sonst über add
	tm.containsKey(3); // überprüft ob 3 drin ist.
	tm.put(3, "Mist"); // würde Mist ausgeben, das obere Hallo wird überschrieben,
						// Schlüsselwort 3 ist dann "Mist" zugeordnet
	tm.get(2).toString(); 
	// ohne toString passiert nix, selbst wenn leer ist wird NUllwert zurückzugeben
	// mit toString ergibt sich der Fehler "nullpointerException" 
	// Lösung mit if davor: "if(tm.containskey(2)"
	
	
	//Beispiel sortierbarkeit:
	
//		class Student implements Comparable<Student>{
//			private int mnr;
//			private String name;
//			public Student(int mnr, String name) {
//				this.mnr = mnr;
//				this.name = name;
//			}
	
//		public int compareTo(Student s) {    // er verlgleicht objekte und liefert ergebnis zurück. größer,kleiner,gleich
//			return this.mnr - s.getMnr();  //mnr aufsteigent sortiert 
//			return s.getMnr() - this.mnr;  //mnr absteigent sortiert
	
	
	
// 		nach namen sortieren:
//		public int compareTo (Student s) {
//			this.name.compareTo(s.getName());
//			1 compare to 2 = aufsteigend
//		    2 comparte to 1  = absteigend
//		    1 = Student Meier und 2 = Student s
//		}
//			
//		LinkedList<Student> sl = new LinkedList<Student>();
//		// wird gefüllt mit Studenten
//		sl.add (new Student(1234, "Meier");
//		.
//		// 
//		collections.sort (sl); // Methode erwartet übergabe der Liste // Default
//		1. Möglichkeit zu sortieren: Interface comparable. Nach der Klasse "implements Comparable <Student>" hinzufügen
	}
		
}

