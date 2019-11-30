
public class StringMethodsEplanation {

	public static void main(String[] args) {
		
		String [] words = {"Wacken","Peter Pan","Baconter","Wajulianter"};
		
		// methode in schleife die �berpr�ft mit welchen anfangsbuchstaben ein String beginnt.
		for(String w : words) {
			if(w.startsWith("Wa"))
				System.out.println(w+" startet mit Wa");  
			// geht durch array. wenn ein objekt mit wa beginnt wird das element ausgeben. wenn nicht passier einfach nix
		}
		
		// sucht vollst�ndig identische W�rter
		for(String w : words) {
			if(w.equals("Wacken"))
				System.out.println(w+" ist gleich wie Wacken");
		}
		
		// sucht w�rter mit gleicher Endung
		for(String w : words) {
			if(w.endsWith("ter"))
				System.out.println(w+" endet mit ter");  
		}

	}

}
