package T01_20190409;

public class Test {

	public static void main(String[] args) {
		Patient s1 = new Patient("Müller");
		Patient s2 = new Patient("Hans");
		Patient s3 = new Patient("Tom");
		Patient s4 = new Patient("Tommy");
		Patient s5 = new Patient("Karl");
		Patient s6 = new Patient("Toni");
		Patient s7 = new Patient("Marco");
		
		Warteschlange<Patient> liste = new Warteschlange<Patient>();
		
		liste.neuerPatient(s1);
		liste.neuerPatient(s2);
		liste.neuerPatient(s3);
		
		System.out.println(liste.naechsterPatient());
		System.out.println(liste.naechsterPatient());
		
		liste.neuerPatient(s4);
		liste.neuerPatient(s5);
		
		System.out.println(liste.naechsterPatient());
		
		liste.neuerPatient(s6);
		liste.neuerPatient(s7);
				
		System.out.println(liste.naechsterPatient());
		System.out.println(liste.naechsterPatient());
		System.out.println(liste.naechsterPatient());
		System.out.println(liste.naechsterPatient());
		System.out.println(liste.naechsterPatient());
		System.out.println(liste.naechsterPatient());
		
		
	}

}
