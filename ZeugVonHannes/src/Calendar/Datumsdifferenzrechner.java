package Calendar;

import java.util.Date;

public class Datumsdifferenzrechner {

	public static long calcDiff(Date first, Date second) {
		double dif = second.getTime() - first.getTime();
		return (long) dif/1000/60/60/24;
	}

}
