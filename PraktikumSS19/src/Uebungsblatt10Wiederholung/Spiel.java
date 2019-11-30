package Uebungsblatt10Wiederholung;
import java.util.*;

public class Spiel {
		public static void main(String[] args) {
			
			
			//(int ykoord, int xkoord,int steinID, boolean istSchwarz,int macht)
			Spielstein s1 = new Dame(10,15,1,true,5);
			Spielstein s2 = new Bauer(1,5,2,false,1);
			Spielstein s3 = new König(2,3,14,true,6);
			Spielstein s4 = new Laeufer(8,10,3,false,2);
			Spielstein s5 = new Springer(4,8,4,true,3);
			Spielstein s6 = new Turm (5,20,5,true,4);
			
			Spieler Fabi = new Spieler("FabianO",20);
			Spieler Maik = new Spieler("MaikKp",25);
			
			TreeMap<Spieler,Spielstein> map1 = new TreeMap<Spieler,Spielstein>();
			
			map1.put(Fabi, s1);
			map1.put(Maik, s3);
			
			for(Spieler s: map1.keySet())
				System.out.println(s.toString());
			
			
			
//			System.out.println(s1.toString());
			
			
//			List<Spielstein> spielsteinliste = new ArrayList<Spielstein>();
//			
//			spielsteinliste.add(s1);
//			spielsteinliste.add(s2);
//			spielsteinliste.add(s3);
//			spielsteinliste.add(s4);
//			spielsteinliste.add(s5);
//			spielsteinliste.add(s6);
//
//			for(Spielstein x: spielsteinliste)
//				System.out.println(x.toString());
//			
//			Collections.sort(spielsteinliste);
//			System.out.println("Nach der SOrtierung:");
//			
//			for(Spielstein x: spielsteinliste)
//				System.out.println(x.toString());

			
			
			
			
		}
}
