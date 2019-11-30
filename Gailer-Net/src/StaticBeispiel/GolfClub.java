package StaticBeispiel;

public class GolfClub {

	private String vorname;
	private String nachname;
	private static int clubzahl = 0;
	
	public GolfClub(String vorn,String nachn) {
		this.vorname = vorn;
		this.nachname = nachn;
		this.clubzahl++;
//		System.out.println("Vorname:"+vorn+"  Nachname:"+nachn+"  Mitlgied-Nr:"+clubzahl);
	}
	

	public String getVorname() {
		return vorname;
	}
	
	public String getNachname() {
		return nachname;
	}
	public static int getClubzahl() {
		return clubzahl;
	}
	
	
}
