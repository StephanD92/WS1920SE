package Calendar;

import java.text.*;
import java.util.*;

public class Datumsausgabe {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		DateFormat df = new SimpleDateFormat("EEEE', der' dd'. 'MMMM' 'yyyy");
		System.out.println(df.format(gc.getTime()));
		int doy = gc.get(GregorianCalendar.DAY_OF_YEAR);
		int kw = gc.get(GregorianCalendar.WEEK_OF_YEAR);
		System.out.println("Heute ist der " + doy + ". Tag des Jahres, KW " + kw);
	}

}