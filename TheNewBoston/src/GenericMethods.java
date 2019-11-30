
public class GenericMethods {

	public static void main(String[] args) {
	
	// generic method. a way illuminate overloaded methodes
	// overloaded methods:
		
	Integer[] iray = {1,2,3,4};
	Character[] cray = {'b','u','c','y'};
	
	String [] zeug = {"Brot","bier","Banane","nille"};
	printMe(iray);
	printMe(cray);
	printMe(zeug);

	}
	// 2 Methoden die funktionieren. Aber wir wollen nicht 1000
	// methoden schreiben. Besser w‰re eine Methode
	// die es drauf hat
	
	
//	public static void printMe(Integer[]i) {
//		for(Integer x : i)
//			System.out.printf("%s ",x);
//		System.out.println();
//	}
//	public static void printMe(Character[]i) {
//		for(Character x : i)
//			System.out.printf("%s ",x);
//		System.out.println();
//	}
	//methode die nur integer arrays ausgeben kann
	
	
	
	
	// wir machen eine Geile "Generic" Methode
	// generics sind geil weil sie helfen diesen
	// ganzen kacke overloaded methoden zu entfernen
	// die brauchen wir nicht die machen zu viel arbeit
	
	// T ist Type Parameter. T ist normal
	// wird wie eine generic form of data betrachtet. die t heiﬂt
	// T muss IMMER vor dem Return typ (void) sein
	

	public static<T> void printMe (T[]x) {
		for(T b: x)
			System.out.printf("%s ",b);
		System.out.println();
	// methode tut die gleiche Sache wie die Methode oben
	// aber man kann ihr alle arten von Daten geben
	// es ist egal ob string, int, double,
	// sie nimmt einfach alles
	}
	
	
	
	

}
