import java.util.*;

public class foreachBeispiel {

	public static void main(String[] args) {

        // erzeugen String Array, reinschreiben in Liste und ausgabe mit foreach schleife
		String[] zeug = {"Peter","Otto","juergen","jochen"};
		List<String> liste = Arrays.asList(zeug);
		
		
		// String ist type und x ist identifier. liste ist name des Arrays
		//for(Typ identifier : name des Arrays)
		for(String x: liste)
		System.out.print(x);

		
		System.out.println();
		
		Integer[] izeug = {1,2,5,6,7,98};
		List<Integer> listei = Arrays.asList(izeug);
		
		for(Integer i: listei)
			//gibt alles aus mit leerzeichen dazwischn, quasi als String
			System.out.printf("%s ",i);
		
		
		System.out.println();
		
		Double[] dzeug = {5.5,66.8,99.7,11245.53};
		List<Double> listed = Arrays.asList(dzeug);
		
		for(Double d: listed)
			System.out.print(d);
		
		
		System.out.println();
		System.out.println();
		
		// array erzeugen mit schleife durchgehen und z.B. gesamten Wert ausgeben
		
		int[] zahlenliste = {1,23,4,7,9,100};
		int summe =0;
		
		for(int i: zahlenliste)
			summe+=i;
		// for-Statement geht durch ganzes Array und speichert jedes mal wert in variable summe bzw addiert es auf summe auf
		
		System.out.println(summe);

	}

}
