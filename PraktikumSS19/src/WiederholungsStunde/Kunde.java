package WiederholungsStunde;


// 2 Möglichkeiten
   // comparable implermentieren wichtig mit kunde und den klammern und die methode compare to (unten) ist wichtig
public class Kunde implements Comparable<Kunde>{
	
	private int kdNummer;
	private String name;
	private boolean aktiv;
	
	

	public int getKdNummer() {
		return kdNummer;
	}
	public void setKdNummer(int kdNummer) {
		this.kdNummer = kdNummer;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAktiv() {
		return aktiv;
	}

	public void setAktiv(boolean aktiv) {
		this.aktiv = aktiv;
	}
	
	public Kunde(int kdNummer, String name, boolean aktiv) {
		super();
		this.kdNummer = kdNummer;
		this.name = name;
		this.aktiv = aktiv;
	}
	
	
	@Override
	public String toString() {
		return "Kunde [kdNummer=" + kdNummer + ", name=" + name + ", aktiv=" + aktiv + "]";
	}
	public static void main(String[] args) {
		

	}
	// standardmuster eine zahl minus die andere für zahlen sortieren
	// nach kundennummer aufsteigen sortieren
	@Override
	public int compareTo(Kunde arg0) {
		return this.kdNummer - arg0.kdNummer;
	}
	
	
	// nach name sortieren (aufsteigen anfangsbuchstabe)
//	public int compareTo(Kunde arg0) {
//		return this.name.compareTo(arg0.name);
//	}
	
	
	// nach status sortieren. die aktiven nach vorne und dann nach name sortieren
//	public int compareTo(Kunde arg0) {
//		if(this.aktiv) {
//			if(!arg0.aktiv) {
//				return -1;
//			} else {
//				return this.name.compareTo(arg0.name);
//			}
//		} else {
//			if(arg0.aktiv) {
//				return 1;
//			} else {
//				return this.name.compareTo(arg0.name);
//			}
//			
//		}

	}


