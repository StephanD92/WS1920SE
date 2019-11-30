package Übungsblatt01;

public class Lebensmittel extends Artikel {

	
	private int MHD;
	
	public Lebensmittel(String name, int artNr, double preis, int MHD) {
		super(name,artNr,preis);
		this.MHD = MHD;
	}

	
	public int getMHD() {
		return MHD;
	}
	public void setMHD(int mHD) {
		this.MHD = mHD;
	}





	@Override
	public String toString() {
		return super.toString() +
				"Lebensmittel (MHD=" + MHD + ")";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
