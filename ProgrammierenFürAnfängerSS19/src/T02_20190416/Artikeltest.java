package T02_20190416;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Artikeltest {


	public static void main(String[] args) {
		
		/*
		 *  Erstellen Sie eine Collection, in der  Artikelobjekte augenommen werden können.
		 */
		LinkedList<Artikel> aliste = new LinkedList<Artikel>();
		
		
		/*
		 *  Artikel erstellen und in Liste aufnehmen
		 */
		aliste.add(new Artikel(10001,"Fueller",29.99));
		aliste.add(new Artikel(10002,"Glas",6.99));
		aliste.add(new Artikel(10003,"Kaffeetasse",5.99));
		aliste.add(new Artikel(10004,"Tischleuchte",29.50));
		aliste.add(new Artikel(10005,"Kugelschreiber",1.99));
		aliste.add(new Artikel(10006,"Bleistift",0.99));
		aliste.add(new Artikel(10007,"Tischkalender",10.00));
		aliste.add(new Artikel(10009,"Folienschreiber Set",4.89));
		aliste.add(new Artikel(10008,"Tafelmagnet",0.59));
		aliste.add(new Artikel(10010,"Lineal 30 cm",3.99));
		aliste.add(new Artikel(10012,"Scheere",2.50));
		aliste.add(new Artikel(10011,"Locher",7.99));
		aliste.add(new Artikel(10014,"Hefter",14.69));
		aliste.add(new Artikel(10013,"Schnellhefter",0.79));
		aliste.add(new Artikel(10015,"Anspitzer",6.09));
		aliste.add(new Artikel(10016,"Radiergummi",1.99));
		aliste.add(new Artikel(10017,"Klebestift",2.49));
		aliste.add(new Artikel(10020,"Stempelkissen",4.29));
		aliste.add(new Artikel(10019,"Textmarker",0.99));
		aliste.add(new Artikel(10018,"Ordner, breit",4.99));
		aliste.add(new Artikel(10021,"Ordner schmal",3.99));		
		aliste.add(new Artikel(10025,"Notitzblock",3.39));
		aliste.add(new Artikel(10023,"Büroklammern",5.55));
		aliste.add(new Artikel(10024,"Heftklammern",2.29));
		aliste.add(new Artikel(10022,"Schreibunterlage",12.99));
		

		/*
		 *  Sortieren Sie die Objekte in der Liste nach dem Sortieralgorithmus, wie er in der Klasse Artikel definiert ist.
		 */
		Collections.sort(aliste);
		/*
		 *  Ausgabe der sortierten Liste
		 */
		ausgabe(aliste);
		
		/*
		 *  Nutzen Sie für die Sortierung die von Ihnen erstellte Komparatorklasse
		 */
		Collections.sort(aliste, new ArtikelNameCompAsc());
		/*
		 *  Ausgabe der sortierten Liste
		 */
		ausgabe(aliste);
		
		Collections.sort(aliste, new Artikel.ArtikelNameCompDesc());
		/*
		 *  Ausgabe der sortierten Liste
		 */
		ausgabe(aliste);
		
		Collections.sort(aliste, new Artikel.ArtikelPreisCompAsc());
		/*
		 *  Ausgabe der sortierten Liste
		 */
		ausgabe(aliste);
	}
	
	/**
	 * Schreiben Sie eine Methode, bei der die Liste ausgegeben wird.
	 * Übergeben Sie die Liste als Parameter
	 */
	public static void ausgabe(LinkedList<Artikel> aliste){
		/*
		 *  Ausgabe einer Leerzeile
		 */
		System.out.println();
		/*
		 * Ausgabe mit formartierter Darstellung
		 */
		
		System.out.printf("%-7s | %-30s | %-10s\n","ArtNr.:","Bezeichnung","Preis");
		System.out.println("========================================================");
		for(Artikel a: aliste) {
			System.out.printf("%7d | %-30s | %8.2f €\n", a.getArtikelnummer(),a.getArtikelbezeichnung(),a.getPreis());
		}
		
		
		
		
		
		/*
		 *  Ausgabe der übergebenen Liste mittels einer for-each-Schleife
		 */
//		for(Artikel a: aliste)
//			System.out.println(a);
		
		/* 
		 * Ausgabe der übergebenen Liste mittes eines Iterators
		 */
//		Iterator<Artikel> it = aliste.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
	}

}
