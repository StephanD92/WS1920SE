import java.util.*;
public class LinkedListErklärung {

	
	public static void main(String[] args) {
		
		String[] things = {"Eier","Krautsalat","Milch","Müsle","Tomaten"};
		List<String> list1 = new LinkedList<String>();
		
		for (String x :things)
			list1.add(x);
		
		String[] things2 = {"Würstchen","Salat","Bacon","harryPotter"};
		List<String> list2 = new LinkedList<String>();
		
		for (String y:things2)
			list2.add(y);
		
		list1.addAll(list2);   // wir packen alles von list2 in Liste1
		list2 = null;
		
		
		
//		for (String a: list1)
//			System.out.printf("%s ",a);
		// ausgabe
//		for(int i=0; i<list1.size(); i++) {
//			System.out.printf("%s ", list1.get(i));
//		}
		
//		printeMe(list2);
//		
		printMe(list1);
		removeStuff(list1,2,5);
		System.out.println();
		printMe(list1);
		
//		System.out.println();
//		reverseMe(list1);
		
		System.out.println();
		printMe(list1);
		
		System.out.println();
		Collections.sort(list1);
		System.out.println();
		printMe(list1);
		
		
		
		}
			private static void printMe (List<String> l) {
					for (String b : l) // schleife die durch liste geht und jedes element wie b behandelt temporär
					System.out.printf("%s ",b);
					System.out.println();
					
			}
			
			private static void removeStuff(List<String> l,int from, int to) {
				l.subList(from, to).clear();  // lösche menge an elementen (z.B. von element 2 bis element 4)
			}
			
			
//			private static void reverseMe (List<String> l) {
//				ListIterator<String> bobby = l.listIterator(l.size());
//				while(bobby.hasPrevious()) // geht durch die Liste und gibt es anschließend aus
//					System.out.printf("%s ",bobby.previous());
//			}
		

}
