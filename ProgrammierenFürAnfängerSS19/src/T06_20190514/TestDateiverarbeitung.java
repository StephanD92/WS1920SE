package T06_20190514;

import java.io.File;
import java.util.LinkedList;

public class TestDateiverarbeitung {

	public static void main(String[] args) {
		Datenverwaltung dv = new Datenverwaltung();
		LinkedList<Artikel> artikelliste = new LinkedList<Artikel>();
		
		artikelliste.add(new Artikel(123456,"Lederjacke",199.99));
		artikelliste.add(new Artikel(234567,"Jeanshose",39.99));
		artikelliste.add(new Artikel(345678,"Sporthose",19.99));
		artikelliste.add(new Artikel(456789,"Schwimmbrille",199.99));
		artikelliste.add(new Artikel(567891,"Badehose",16.49));
		artikelliste.add(new Artikel(678912,"Sprotschuhe",129.00));
		artikelliste.add(new Artikel(789123,"T-Shirt",29.99));
		artikelliste.add(new Artikel(891234,"Guertel",16.29));
		File file = new MyFileChooser().save();
		if(file != null) {
			dv.saveObject(file, artikelliste);
			new DateiverwaltungGUI();	
		}
			
	}

}
