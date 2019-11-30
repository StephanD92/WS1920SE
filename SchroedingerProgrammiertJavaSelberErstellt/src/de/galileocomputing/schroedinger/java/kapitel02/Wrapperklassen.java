package de.galileocomputing.schroedinger.java.kapitel02;

import java.io.IOException;

public class Wrapperklassen {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		/* sind quasi Objektversionen f�r die primitiven Datentypen. Alle primitiven Datentypen haben
		 * haben eine Wrapperklasse. Wrapperklassen f�r Zahlen:
		 		-short -> Short
		 		-byte -> Byte
		   		-int -> Integer
		   		-long -> Long
		   		-float -> Float
		    	-long -> Long
		   
		   keine Zahlen:
		   		- char -> Character
		   		- boolean -> Boolean
		   Sind also quasi einfach Gro� und dabei manchmal l�nger geschrieben (Integer,Character)
		*/  		
		
		//ValueOf man kann Zahlen zur zugeh�rigen Wrapperklasse Parsen oder sogar auch Strings
		Integer intTestString = Integer.valueOf("5001");  //hier k�nnen aber nur zahlen genommen werden
		System.out.println("intTestString: "+intTestString);
		Float floatTestString = Float.valueOf("235");
		System.out.println("floatTestString: "+ floatTestString);
		
		//Integer intzahl1 = Integer.valueOf(args [0]); // Programmparameter wird hier in Ganzzahl umgewandelt
		// args Array enth�lt ja nur Strings
		
		Integer intzahl = new Integer (5); // Schl�sselwort new legt IMMER neues Objekt an kann unn�tige ressourcen kosten
		Integer intzahl1 = Integer.valueOf(5); // besere Variante
		Integer intzahl2 = 5;  // das gleiche wie valueOf nur mit weniger Schreibarbeit
		// in beiden F�llen wird 
		System.out.println("int1: "+ intzahl);
		System.out.println("int2: "+ intzahl1);
		System.out.println("int3: "+ intzahl2);
		
		
		Byte byte1 = Byte.valueOf((byte) 10);
		Byte byte2 = 10; // valueOf in k�rzer
		Byte byte3 = new Byte((byte) 10);  // neues Objekt
		// Byte byte5 = new Byte(10); ergbibt fehler weil Casting fehlt
		System.out.println("byte1: "+ byte1);
		System.out.println("byte2: "+ byte2);
		System.out.println("byte3: "+ byte3);
		
		
		
		//Long long5 = 10; ergibt fehler weil casting fehlt
		Long long1 = (long)15;
		Long long2 = new Long(15);
		System.out.println("long1: "+ long1);
		System.out.println("long2: "+ long2);
		
		
		Float float1 = (float)20;
		Float float2 = new Float(20);
		System.out.println("Float1: "+ float1);
		System.out.println("Float2: "+ float2);
		
		
		Double double1 = (double) 25; // casting auch hier notwendig
		Double double2 = new Double(25);
		System.out.println("double1: "+ double1);
		System.out.println("double2: "+ double2);
		System.err.println("Wichtig: ValueOf");
	}

}
