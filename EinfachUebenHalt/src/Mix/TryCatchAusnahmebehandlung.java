package Mix;

import java.io.File;
import java.util.Scanner;

public class TryCatchAusnahmebehandlung {

	public static void main(String[] args) {
		
		
		
//		File f = new File("C://Users//Stephan D//test.txt");    //slash in String ist // und nicht einmal /
//		
//		if(f.exists()) {
//			System.out.println("Die Datei "+f.getName()+" gibt es!");
//		}else {
//			System.out.println("Die Datei "+f.getName()+"gibt es nicht");
//		}
		
		
		
		
		
		
		int zahl1, zahl2, zahl3;
		Scanner s = new Scanner(System.in);
		
		zahl1 = s.nextInt();
		zahl2 = s.nextInt();
		
		try {
			zahl3 = zahl1/zahl2;
			
		}catch(Exception e) {
			System.err.println("Fehler!"+ e.toString());
			zahl3 = 0;
		}
		
		System.out.println(zahl3);
		
	}
	
}
