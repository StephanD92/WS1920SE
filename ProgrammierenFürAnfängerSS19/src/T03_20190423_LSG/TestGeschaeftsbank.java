package T03_20190423_LSG;

import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeMap;

public class TestGeschaeftsbank {

	public static void main(String[] args) {
		LinkedList<Konto> kontoliste = new LinkedList<Konto>();
		kontoliste.add(new Girokonto(4711,"Meier",0.5,125.55,-2500.00,12.3));
		kontoliste.add(new Sparplankonto(1458,"Kleemann",1.5,600.00,10,150.00));
		kontoliste.add(new Termingeld(5632,"Kaufmann",0.9,1025.90,7,125.00));
		kontoliste.add(new Girokonto(2389,"Mueller",0.5,49.55,-400.00,12.3));
		kontoliste.add(new Sparplankonto(2599,"Hotte",1.5,12600.00,5,200.00));
		kontoliste.add(new Termingeld(7856,"Laufmann",0.9,5000.00,7,250.00));
		kontoliste.add(new Girokonto(2258,"Drotte",0.5,-12.20,-500.00,12.3));
		kontoliste.add(new Sparplankonto(4458,"Aaroon",1.5,250.00,10,25.00));
		kontoliste.add(new Termingeld(4523,"Beinke",0.9,4500.00,7,150.00));
		kontoliste.add(new Girokonto(7756,"Hartmann",0.5,2269.00,-4500.00,12.3));
		kontoliste.add(new Sparplankonto(9934,"Franjo",1.5,69.45,4,15.00));
		kontoliste.add(new Termingeld(6521,"Strunk",0.9,6900.00,5,225.00));
		
		ausgabe(kontoliste);
		
		Collections.sort(kontoliste, new Konto.CompKontoInhaberAsc()); // Name aufsteigend
		
		ausgabe(kontoliste);
		
		Collections.sort(kontoliste, new Konto.CompKontoNrDesc()); //Kontonummer absteigend
		
		ausgabe(kontoliste);
		
		Collections.sort(kontoliste, new Konto.CompKontostandAsc()); // Kontostand aufsteigend
		
		ausgabe(kontoliste);
		
	}
	
	public static void ausgabe(LinkedList<Konto> kontoliste) {
		System.out.println("--Ausgabe der Konten--");
		for(Konto k : kontoliste) {
			System.out.println(k);
			// to String methode des KOntos wird aufgerufen
		}
		System.out.println();
	}
	
	public static TreeMap<Integer, Konto> getMap(LinkedList<Konto> kontoliste){
		TreeMap<Integer, Konto> tm = new TreeMap<Integer, Konto>();
		for(Konto k : kontoliste)
			tm.put(k.getKontoNr(),k);
		return tm;
	}
	
	public static LinkedList<Konto> getList(TreeMap<Integer, Konto> tm){
		return new LinkedList<Konto>(tm.values());
		//  wird umgepackt von treepmap in linkedList
	
		
	
//	public Integer[] toArray(TreeMap<Integer, Konto> tm) {
//		LinkedList<Integer> ll = new LinkedList<Integer>(tm.keySet());
//		Integer[] arr = ll.toArray(new Integer[ll.size()]);
//		return arr;	
//	}
	}

}
