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
//	    feiern.gru�();
//
//	    Geburtstag  geb  = new Geburtstag( name, 21 );
//	    geb.gru�();
//
//	    Valentin val = new Valentin( name, 7 );
//	    val.gru�();
//		Karte feiern = new Feiertag("WIlli");
//		feiern.gru�();
//		Feiertag feiern2 = new Feiertag("G�nther");
//		feiern2.gru�();
		
//		Karte postkarte = new Feiertag("Will");
//		postkarte.gru�();
//		
//		postkarte = new Geburtstag("Peter",21);
//		postkarte.gru�();
//		
//		postkarte = new Valentin("Uschi",23);
//		postkarte.gru�();
//		Kindergeburtstag g2 = new Kindergeburtstag("Felix",11);
//		g2.gru�("Petra");
		
//		Geburtstag g3 = new ErwachsenenGeburtstag("Peter",45);
//		g3.gru�();
		
		// Arbeiten mit Array und Ausgabe verschiedener Objekte dahinter
//		Karte [] karten = new Karte[12];
//		
//		karten[0] = new Valentin("Sandra",23);
//		karten[1] = new Kindergeburtstag("Kevin",12);
//		karten[2] = new ErwachsenenGeburtstag("Peter",45);
//		karten[3] = new Geburtstag("J�rgen",45);
//		karten[4] = new Feiertag("Melissa");
//		
//		for(int i=0; i<=5; i++) {
//			karten[i].gru�();
//		}
		
		Kindergeburtstag k1 = new Kindergeburtstag("Jan",12);
		k1.gru�("walther");
		k1.gru�();
		
		Object obj;
		Kindergeburtstag kinder = new Kindergeburtstag("Phillip",5);
		String str = "Buschbachweg";
		obj = str;
		// ((Kindergeburtstag)obj).gru�("Stjopa"); //typumwanldung um obj als Kindergeburstag ausgeben zu k�nnen
		// obj.gru�(); //funktioniert nicht
		
		if(obj instanceof Kindergeburtstag)
			((Kindergeburtstag)obj).gru�("Stjopa");
		if (str instanceof String)
			System.out.println((String)str);
	}

}
