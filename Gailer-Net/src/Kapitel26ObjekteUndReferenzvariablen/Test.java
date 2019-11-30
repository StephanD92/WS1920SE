package Kapitel26ObjekteUndReferenzvariablen;

public class Test {

	public static void main(String[] args) {
		
		String str = new String("Peter");
		String str2 = new String("Peter");
		
		System.out.println(str);
		System.out.println(str2);
		
		String obja = new String("Hund");
		String objb = new String("Hund");
		
		if (obja == objb)
			System.out.println("das selbe Objekt! (Identität)");
		
		//es gibt 2 Objekte. str ist Referenzvariable zu objekt Peter
		// str2 ist referenzvariabeln zu Peter. Peter ist beides mal gleich. aber es sind trotzdem 2 Objekte
		// auch wenn der INhalt der objekte komplett gleich ist, ist somit obja == objb false
		
		
		if (obja.equals(objb))
			System.out.println("beide Inhalte gleich (Äquivalent)");
		
		// die Methode equals überprüft ob die INhalte gleich sind. der == operate überprüf ob es sich um das SELBE objekt handel
		// wann also obja == objab true ist, gibt es 2 Referenzvariablen die beide auf das selbe objekt verweisen
		
		
		// erzeugt ein Stringliteral (ein Objekt der Klasse String) Es wird nur EIN Objekt erzeugt
		// ein Stringliteral ist ein Objekt.
		String stra, strb;
		stra = "wacken";
		strb = "wacken";
		// weil stra und strb beide gleich sind, wird nur ein Objekt erzegut und beide referenzvariablen (stra und strb) verweisen auf
		// dieses eine Objekt
		
		String saa, sbb;
		saa = "wacken";
		sbb = "Wacken ist geil";
		// weil saa und sbb sich unterscheiden werden 2 Objekte erzeugt. saa verweist auf wacken und sbb auf wacken ist geil
		
		// hier werden durch den new Operator nacheinander ZWEI objekte erzeugt
		String sa, sb;
		sa = new String("hallo");
		sb = new String("wacken?");

		System.out.println(stra);
		System.out.println(strb);
		

	}


}
