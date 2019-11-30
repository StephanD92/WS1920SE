package Uebungsblatt10Wiederholung;

import java.io.Serializable;

public abstract class Spielstein implements Serializable,Comparable<Spielstein>,Positionierbar{

	
	int ykoord;
	int xkoord;
	int SpielsteinID;
	boolean istSchwarz;
	int Macht;
	
	
	public Spielstein(int ykoord, int xkoord,int steinID, boolean istSchwarz,int macht){
				this.ykoord = ykoord;
				this.xkoord = xkoord;
				this.SpielsteinID = steinID;
				this.istSchwarz = istSchwarz;
				this.Macht = macht;
			}
		


	public int getYkoord() {
		return ykoord;
	}
	public void setYkoord(int ykoord) {
		this.ykoord = ykoord;
	}

	public int getXkoord() {
		return xkoord;
	}

	public void setXkoord(int xkoord) {
		this.xkoord = xkoord;
	}


	public int getSpielsteinID() {
		return SpielsteinID;
	}


	public void setSpielsteinID(int spielsteinID) {
		SpielsteinID = spielsteinID;
	}

	public boolean isIstSchwarz() {
		return istSchwarz;
	}


	public void setIstSchwarz(boolean istSchwarz) {
		this.istSchwarz = istSchwarz;
	}


	public int getMacht() {
		return Macht;
	}

	public void setMacht(int macht) {
		Macht = macht;
	}


	@Override
	public String toString() {
		return "Spielstein [ykoord=" + ykoord + ", xkoord=" + xkoord + ", SpielsteinID=" + SpielsteinID
				+ ", istSchwarz=" + istSchwarz + ", Macht=" + Macht + "]";
	}


	public int compareTo(Spielstein spielstein){
		return this.Macht - spielstein.getMacht();
	}





	

	
		
	
}
