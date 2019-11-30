package Mix;
import java.util.*;

import edu.bielefeld.io.EAM;
public class DatumShit {

	
	public static void main(String[] args) {
		
		
		GregorianCalendar cal1 = new GregorianCalendar();
		
		int day = cal1.get(GregorianCalendar.DAY_OF_MONTH);
		int month = cal1.get(GregorianCalendar.MONTH);
		int year = cal1.get(GregorianCalendar.YEAR);
		
		System.out.println("Das heutige Datum ist "+day+"."+(month+1)+"."+year);
		
		
		int zahl = EAM.rInt();
		System.out.println(zahl);
		
	}
	
	
}
