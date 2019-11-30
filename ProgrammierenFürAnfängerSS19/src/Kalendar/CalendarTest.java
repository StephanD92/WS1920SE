package Kalendar;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {

	
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		
		
		// Ausgabe mit Methoden der KLasse gegorianCalendar
//		System.out.println(cal);
//		
//		System.out.println(cal.get(GregorianCalendar.DAY_OF_MONTH+"."+GregorianCalendar.MONTH+" "
//				+GregorianCalendar.YEAR));
		
		// Formatierte Ausgabe
		DateFormat dtf = DateFormat.getTimeInstance();
		System.out.println("Aktuelle Uhrzeut "+ dtf.format(cal.getTime()));
		// GIbt aktuelle Uhrzeit aus
				
		DateFormat df = DateFormat.getDateInstance();
		System.out.println("Heute ist der "+ df.format(cal.getTime()));
		// Gibt aktuelles Datum aus
		
		
		DateFormat sdf2 = new SimpleDateFormat ("EEEE', den 'dd.MM.yyyy', um 'hh:mm' Uhr");
		System.out.println(sdf2);
		
	}
	
	
	
}
