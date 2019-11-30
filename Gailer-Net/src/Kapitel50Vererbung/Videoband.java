package Kapitel50Vererbung;

public class Videoband
{
	
	 public static void main ( String args[] ){
		    Videoband artikelA = new Videoband("Jaws", 120, 50 );
		    Videoband artikelB = new Videoband("Star Wars", 50);

		    artikelA.anzeigen();
		    System.out.println();
		    artikelB.anzeigen();
		  }
	 
	  String   titel;        // Titel des Videos
	  int      laenge;       // Anzahl der Minuten
	  boolean  vorhanden;    // ist das Video vorhanden?
	  int leihgebuehr;
	  
	  // Konstruktor
	  public Videoband( String ttl, int lgeb )
	  {
	    titel = ttl; laenge = 90; vorhanden = true; leihgebuehr = lgeb; 
	  }

	  // Konstruktor
	  public Videoband( String ttl, int len, int lgeb, boolean verf )
	  {
	    titel = ttl; laenge = len;  leihgebuehr = lgeb; vorhanden = verf;
	  }

	  public void anzeigen() {
	    System.out.println("Titel: "+titel + "\nLaufzeit: " + laenge + " Min. "+"\nverfuegbar: "+ vorhanden +"\nLeihgebühr: "+leihgebuehr );
	  }

	}
	