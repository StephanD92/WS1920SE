package StaticBeispiel;

public class Mitglieder {

	public static void main(String[] args) {
		
		GolfClub G1 = new GolfClub("Peter","Pan");
		GolfClub G2 = new GolfClub("Tiger", "Woods");
		GolfClub G3 = new GolfClub("Stjopa","Deluxe");
		GolfClub G4 = new GolfClub("Reicher", "Sack");
		
		
		System.out.print(G1.getVorname());
		System.out.print(G1.getNachname());
		System.out.print(G1.getClubzahl());
		
		System.out.println();
		
		System.out.println("Eintritt von "+G1.getVorname()+"Aktuelle Zahl: "+G2.getClubzahl());
		System.out.println("Eintritt von "+G2.getVorname()+"Aktuelle Zahl: "+G2.getClubzahl());
		System.out.println("Eintritt von "+G3.getVorname()+"Aktuelle Zahl: "+G3.getClubzahl());
		
		//aktuelle Clubzahl ausgeben unabhängig von Objekten
		System.out.println(GolfClub.getClubzahl());
		
	}
}
