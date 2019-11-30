//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.sql.Date;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.GregorianCalendar;
//import java.util.Calendar;
//import java.time.*;
//import java.util.*;
//import java.io.*;
//import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class UBlatt1Aufg4 {

	public static void main(String[] args) {

		
		System.out.println("Stunden1: ");
		int Std1 = EAM.rInt();
		System.out.println("Min1:");
		int min1 = EAM.rInt();
		
		System.out.println("Stunden2: ");
		int Std2 = EAM.rInt();
		System.out.println("Min2");
		int min2 = EAM.rInt();
		
		System.out.println("Uhrzeit1: "+Std1+":"+min1+" Uhr");
		System.out.println("Uhrzeit2: "+Std2+":"+min2+" Uhr");
		
		
		
		int UnterschiedStd = Std1-Std2;
		

	}

	private static char[] getTime() {
		// TODO Auto-generated method stub
		return null;
	}

	
//	Date zeitstempel = new Date(0);
//	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
//	System.out.println("Datum: " + simpleDateFormat.format(zeitstempel));
	
	
//	String datumString = "23.02.2012 23:11:00";
//	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
//	Date zeitstempel = simpleDateFormat.parse(datumString);
//	System.out.println(zeitstempel);
	

//	DateFormat df = new SimpleDateFormat("HH:mm");
//     
//     String time1 = "8:00";
//     String time2 = "9:16";
//     
//     Date date1 = df.parse(time1);
//     Date date2 = df.parse(time2);
//     
//     long dif = date2.getTime()- date1.getTime(); //ms
//     
//     System.out.println(dif/1000 +" sekunden");
	
	
	
//	String time1 = "16:00:00";
//	String time2 = "19:00:00";
//
//	SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
//	java.util.Date date1 = format.parse(time1);
//	java.util.Date date2 = format.parse(time2);
//	long difference = date2.getTime() - date1.getTime(); 
	
	
//	Date d1 = new Date();
//	Date d2 = new Date();
//	System.out.println(d2.getTime()-d1.getTime()); //gives the time difference in milliseconds. 
//	System.out.println((d2.getTime()-d1.getTime())/1000); //gives the time difference in seconds.
	
	
	
	
	
	
	
}
