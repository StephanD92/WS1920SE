package CollectionsundSortierung;

import java.util.Comparator;

// erkl�rung comparatorKlasse

public class MyComtMnrAsc implements Comparator<Student> {
	
	// interface hat methode die �berschrieben werden muss
	public int compare(Student s1, Student s2) {
		return s1.getMnr() - s2.getMnr();
	}
}

// verwendung der Comparator KLasse:

Collections.sort (sl, new MxCompMnrAsc()); // Komparatorklasse zur Anwendung gebracht
