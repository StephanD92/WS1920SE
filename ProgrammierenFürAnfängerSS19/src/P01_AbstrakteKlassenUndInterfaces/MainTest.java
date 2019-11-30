package P01_AbstrakteKlassenUndInterfaces;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainTest {

	public static void main(String[] args) {
		
		Adresse adresse = new Adresse("Am Hundebach", "7", 32049, "Herford");
		Calendar gebdat = new GregorianCalendar(1974,07,28);
		Hochschulangehoeriger sascha = new Mitarbeiter("Leonardo", "Sascha",adresse,"05221-12007614",gebdat,"B 411","0521-106-67394");
		Hochschulangehoeriger alexander = new Professor("Förster", "Alexander",adresse,"05221-12007614",gebdat,"B 410","0521-106-67394","Informatik");
		Hochschulangehoeriger hannes = new Student("Schreck", "Hannes",adresse,"05221-12007614",gebdat,"Wirtschaftsinformatik",125698);
		
		/*
		 * Speichern der Objekte in einem Array mit fester Anzahl an Feldern
		 */
//		Hochschulangehoeriger[] liste = {sascha,alexander,hannes};
//		
//		for(int i = 0 ; i < liste.length ; i++){
//			System.out.println(liste[i]);
//			System.out.println();
//		}
		
		sascha.ausgabe();  //ausgabe mit ausgabemethode
		System.out.println(sascha);  //ausgabe ohne ausgabemethode
	}

}
