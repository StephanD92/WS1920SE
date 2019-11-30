package Navigationssoftware;

public class StadtStrassenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Stadt[] staedte = new Stadt[4];
		staedte[0] = new Stadt("Muenchen");
		staedte[1] = new Stadt("Hamburg");
		staedte[2] = new Stadt("Berlin");
		staedte[3] = new Stadt("Bielefeld");
		Strasse a1 = new Strasse("A1", 500, staedte[0], staedte[1]);
		Strasse a2 = new Strasse("A2", 600, staedte[2], staedte[3]);
		Strasse a3 = new Strasse("A3", 700, staedte[0], staedte[2]);
		Strasse a4 = new Strasse("A4", 800, staedte[1], staedte[3]);
		for (Stadt s: staedte) {
			System.out.println(s);*/
		StadtohneStrasse muenchen = new StadtohneStrasse("Muenchen");
		StadtohneStrasse berlin = new StadtohneStrasse("Berlin");
		berlin.addVerbindung(muenchen, 600);
		System.out.println(berlin.routeBerechnen(muenchen));
		
	}

}
