package de.galileocomputing.schroedinger.java.kapitel06.Vererbung.Musikgruppe;

public class Proberaum {

	public static void main(String[] args) {
		
		Musiker saenger = new Saenger("uschi","peters",26,"deepVoice1");
		Musiker saenger2 = new Saenger("peter","hage",34,"hardvoidce2");
		Gitarrist gitarrist = new Gitarrist("Jochen","Peters",22,"drownking");
//		// Bassist bassist = new Bassist();  man kann am Anfang Bassist oder Allgemeinere Klasse (Musiker) schreiben
		Musiker bassist = new Bassist("Udo","juergends",44,"bassKing");
		Trompeter trompeter = new Trompeter("Hand","imgluck",55,"trompeter4Life");
		BackgroundSaengerin backgroundsaengerin = new BackgroundSaengerin("hanna","krone",55,"kronkesingtbackground");
		machtMusik(saenger,saenger2,gitarrist,bassist,trompeter,backgroundsaengerin);
//		saenger.musizieren();
//		System.out.println();
//		saenger2.musizieren();
//		bassist.musizieren();
//		backgroundsaengerin.musizieren();
//		trompeter.musizieren();					diese 4 zeilen lassen die leute einzeln musizieren
	}
	
	public static void machtMusik(Musiker...gruppe) {
		for(Musiker musiker : gruppe) {
			musiker.musizieren();
		}
	}

}
