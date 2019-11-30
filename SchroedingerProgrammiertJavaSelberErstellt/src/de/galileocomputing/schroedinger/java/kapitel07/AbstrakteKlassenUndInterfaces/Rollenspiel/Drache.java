package de.galileocomputing.schroedinger.java.kapitel07.AbstrakteKlassenUndInterfaces.Rollenspiel;

public abstract class Drache extends RollenspielCharakter{

	public abstract void spucken();
	public void fliegen() {
		//fliegen
	}
	
	public static void main(String[] args) {
		Drache drache = new RiesenschneckenDrache();
		drache.spucken();
	}
}
