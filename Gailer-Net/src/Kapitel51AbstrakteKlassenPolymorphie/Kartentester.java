package Kapitel51AbstrakteKlassenPolymorphie;

//import java.util.Scanner;

public class Kartentester {

	public static void main(String[] args) {
		
//		String name;
//	    Scanner scan = new Scanner( System.in );
//
//	    System.out.println("Ihr Name");
//	    name = scan.nextLine();
//	    Feiertag   feiern = new Feiertag( name );
//	    feiern.gruß();
//
//	    Geburtstag  geb  = new Geburtstag( name, 21 );
//	    geb.gruß();
//
//	    Valentin val = new Valentin( name, 7 );
//	    val.gruß();
//		Karte feiern = new Feiertag("WIlli");
//		feiern.gruß();
//		Feiertag feiern2 = new Feiertag("Günther");
//		feiern2.gruß();
		
//		Karte postkarte = new Feiertag("Will");
//		postkarte.gruß();
//		
//		postkarte = new Geburtstag("Peter",21);
//		postkarte.gruß();
//		
//		postkarte = new Valentin("Uschi",23);
//		postkarte.gruß();
//		Kindergeburtstag g2 = new Kindergeburtstag("Felix",11);
//		g2.gruß("Petra");
		
//		Geburtstag g3 = new ErwachsenenGeburtstag("Peter",45);
//		g3.gruß();
		
		// Arbeiten mit Array und Ausgabe verschiedener Objekte dahinter
//		Karte [] karten = new Karte[12];
//		
//		karten[0] = new Valentin("Sandra",23);
//		karten[1] = new Kindergeburtstag("Kevin",12);
//		karten[2] = new ErwachsenenGeburtstag("Peter",45);
//		karten[3] = new Geburtstag("Jürgen",45);
//		karten[4] = new Feiertag("Melissa");
//		
//		for(int i=0; i<=5; i++) {
//			karten[i].gruß();
//		}
		
		Kindergeburtstag k1 = new Kindergeburtstag("Jan",12);
		k1.gruß("walther");
		k1.gruß();
		
		Object obj;
		Kindergeburtstag kinder = new Kindergeburtstag("Phillip",5);
		String str = "Buschbachweg";
		obj = str;
		// ((Kindergeburtstag)obj).gruß("Stjopa"); //typumwanldung um obj als Kindergeburstag ausgeben zu können
		// obj.gruß(); //funktioniert nicht
		
		if(obj instanceof Kindergeburtstag)
			((Kindergeburtstag)obj).gruß("Stjopa");
		if (str instanceof String)
			System.out.println((String)str);
	}

}
