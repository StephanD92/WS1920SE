package T09_20190604;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Monatskalendar {

	private String[] wochentage = { "Mo", "Di", "Mi", "Do", "Fr", "Sa", "So" };
	Calendar cal;

	public Monatskalendar() {
		cal = new GregorianCalendar();
		printDate();
		printMonth();
	}

	public void printDate() {
		DateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		System.out.println("Heute ist der " + sdf.format(cal.getTime()));
	}

	public void printMonth() {
		cal.set(GregorianCalendar.DAY_OF_MONTH, 1);
		int wochenTagDesErsten = cal.get(GregorianCalendar.DAY_OF_WEEK);
		int anzahlTageImMonat = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);

//		System.err.println(wochenTagDesErsten);
		
		// Anpassung der Wochentage an deutsche Gepflogenheit ( 0 = Montag )
//		int heutigerWochentag = (cal.get(GregorianCalendar.DAY_OF_WEEK) + 5) % 7;
		wochenTagDesErsten = (wochenTagDesErsten + 5) % 7;

//		System.err.println(wochenTagDesErsten);
		// Erste Zeile mit Wochentagen ausgeben
		for (int i = 0; i < wochentage.length; i++)
			System.out.printf("%5s", wochentage[i]);
		System.out.println();

		// zunaechst alle Wochentage überspringen, bis der erste Wochentag des Monats
		// erreicht ist.
		int spalte;
		for (spalte = 0; spalte < wochenTagDesErsten; spalte++) {
			System.out.printf("%5s", "");
		}

//		System.err.println(spalte);
		// Alle Wochentage des Monats ausgeben
		for (int tag = 1; tag <= anzahlTageImMonat; tag++) {
			System.out.printf("%5d", tag);
			++spalte;
			// Nach 7 Tagen soll ein Zielenumbruch generiert werden
			if (spalte >= 7) {
				System.out.println();
				spalte = 0;
			}
		}

	}

	public static void main(String[] args) {
		new Monatskalendar();
	}

}
