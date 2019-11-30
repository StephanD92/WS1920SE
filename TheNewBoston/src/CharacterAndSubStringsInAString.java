
public class CharacterAndSubStringsInAString {

	public static void main(String[] args) {
		
		String s = "stephanduecksiehtechtgutaus,jagenaustephanmeineich";
		
		
		String a = "BaconB";
		String b = "monster";
		
		// einfach aber oft nicht gewünscht.
//		System.out.println(a+b);
		
		
		//bessere methode um 2 Strings zusammen zu führen
		System.out.println(a.concat(b));
		
		
		// ersetzt a durch b
		System.out.println(a.replace(a, b));
		
		//nimmt den alle Buchstaben B von Bacon und ersetzt ihn durch ein F
		System.out.println(a.replace("B","F"));
		
		// nützlich um daten konsisten zu machen. macht alle Buchstaben groß
		System.out.println(b.toUpperCase());
		
		
		String c ="     zuvieleLeerzeichena     ";
		
		//entfernt alleleerzeichen, (nicht die in der mitte) (ich glaube auch die dahinter. aber kp wie man das erkennt
		System.out.println(c.trim());
		
		
		
		
		
		
		
		
		//sucht den ersten index von a - ergebnis ist 5.
		// weil das erste a an Stelle 6 (stelle 1 ist ja 0,Stelle2 ist 1 usw.) des String ist
//		System.out.println(s.indexOf("a"));
		
//		System.out.println(s.indexOf("stephan",25));
		//geht auch mit sogenanntem SubString also ganzen Wörtern
		
		
		//s.indexOf versteht sich auch als StartingPoint. macht das gleiche wie ausgabe dadrueber
		// aber ignoriert die erste 6 Stellen
//		System.out.println(s.indexOf("a",6));
		
		
		// da sich kein x darin befindet gibt die methode -1 aus
//		System.out.println(s.indexOf("x"));
		
		// gibt länge des String aus
//		System.out.println(s.length());
		
		//gibt s ab Stelle 7 aus
//		System.out.println(s.substring(7));
		
		
	}

}
