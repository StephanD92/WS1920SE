package de.galileocomputing.schroedinger.java.kapitel03;
import java.io.*;
import java.math.*;
public class AberglaubenIfAnweisung  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Es wird gepr�ft ob ein Startparameter �bergeben wurde, dann wird er �bergeben und mithilfe der
//		Wrapper klasse zu Integer geparsed. (k�nnen wir �berhaupt was damit anfangen)
//		Ist die zahl durch 7 teilbar kommt ausgabe gl�ck gehabt. Sonst pech gehabt
//		Wurde keine Zahl �bergeben kommt keine zahl �bergeben (falls etwas anderes als zahl �bergeben
//		wurde kommt eine Fehlermeldung)
		
		if (args.length > 0) {
			String parameter = args[0]; // wir nehmen den Startparameter. also was wir bei Run configuration
			// eingetragen haben
			int zahl = Integer.parseInt(parameter);
			if (zahl%7 == 0) {
				System.out.println("Gl�ck gehabt");
			} else {
				System.out.println("Pech gehabt");
			}
		}
		else {
			System.err.println("Keine Zahl �bergeben");
		}
		
	}

}
