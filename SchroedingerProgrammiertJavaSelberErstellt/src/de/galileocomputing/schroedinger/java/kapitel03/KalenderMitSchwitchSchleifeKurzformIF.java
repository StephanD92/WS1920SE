package de.galileocomputing.schroedinger.java.kapitel03;

public class KalenderMitSchwitchSchleifeKurzformIF {

	public static void main(String[] args) {
		int startmonat = 4;
		int starttag = 6;
		
		if(startmonat >=0 && startmonat <=11 && starttag >=0 && starttag <=6) {
			int tage;
			switch(startmonat) {
			case 0 : case 2 : case 4 : case 6 : case 7 : case 9 : case 11 :
				tage = 31;
				break;
			case 1:
				tage = 28;
				break;
			default:
				tage = 30;
			}
		System.out.println("|MO|DI|MI|DO|FR|SA|SO|");
			int wochen = (tage + starttag) > 35 ? 6 : 5;   //kurzform einer IF-Abfrage. langversion steht drunter
//			if ((tage+starttag)>35) {
//				wochen = 6;
//			}else {
//				wochen = 5;
//			}
			
		for (int woche = 1; woche<=wochen; woche++) {
			for (int tag=1; tag<=7; tag++) {
				int datum = tag+(woche-1)*7-starttag;
				if(datum>0 && datum <=tage) {
					System.out.print("|" + ((datum<10) ? " " : "") + datum); //ein leerzeichen wenn Zahl einstellig. bei zweistelliger zahl kein leerzeichen
				} else {
					System.out.print("|  ");   //für die leeren Tage bzw die Fehler die leer bleiben
				}
			}
			System.out.println("|");
		}
	}

	}}
