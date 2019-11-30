import java.util.*;

public class FrequencyDisjointCollectoinMethode {

	
	public static void main(String[] args) {
		
		
		String[] zeug = {"Funkmaus","s��eMaius","hei�eBraut","PeterPan","Funkmaus"};
		List<String> zeugListe = Arrays.asList(zeug);
		
		
		String[] mehrZeug = {"Peter Pan","Apfel","Tennisschl�ger","Wacken","Funkmaus"};
		List<String> mehrZeugListe = Arrays.asList(mehrZeug);
		
		
		// frequency:
		// vergleicht liste mit element, z�hlt wie oft elemente in Liste drin sind
		
		// gibt an wie oft "Funkmaus" in Liste zeugListe vorkommt
		System.out.println(Collections.frequency(zeugListe, "Funkmaus"));
		
		
	   //disjoin:
	   // verlgeicht 2 Collections und gibt true zur�ck wenn sie nix gemeinsam haben
		// true wenn keine Gemeinsamkeit besteht
		// false wenn es gemeinsamkeiten gibt
		boolean tof = Collections.disjoint(zeugListe, mehrZeugListe);
		System.out.println(tof);
		
	
		
	}
	
	
	
}
