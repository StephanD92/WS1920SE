package de.galileocomputing.schroedinger.java.kapitel03;
import java.io.*;
import java.math.*;
public class AberglaubenIfAnweisung  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Es wird geprüft ob ein Startparameter übergeben wurde, dann wird er übergeben und mithilfe der
//		Wrapper klasse zu Integer geparsed. (können wir überhaupt was damit anfangen)
//		Ist die zahl durch 7 teilbar kommt ausgabe glück gehabt. Sonst pech gehabt
//		Wurde keine Zahl übergeben kommt keine zahl übergeben (falls etwas anderes als zahl übergeben
//		wurde kommt eine Fehlermeldung)
		
		if (args.length > 0) {
			String parameter = args[0]; // wir nehmen den Startparameter. also was wir bei Run configuration
			// eingetragen haben
			int zahl = Integer.parseInt(parameter);
			if (zahl%7 == 0) {
				System.out.println("Glück gehabt");
			} else {
				System.out.println("Pech gehabt");
			}
		}
		else {
			System.err.println("Keine Zahl übergeben");
		}
		
	}

}
