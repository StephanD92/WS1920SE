package ComparableUndComparatpr;

public class Laptop {

	
	private String marke;
	private int ram;
	private int preis;
	
	public Laptop(String marke, int ram, int preis) {
		super();
		this.marke = marke;
		this.ram = ram;
		this.preis = preis;
	}
	
	public String getMarke() {
		return marke;
	}
	public void setMarke(String marke) {
		this.marke = marke;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPreis() {
		return preis;
	}
	public void setPreis(int preis) {
		this.preis = preis;
	}
	
	

	@Override
	public String toString() {
		return "Laptop [marke=" + marke + ", ram=" + ram + ", preis=" + preis + "]";
	}

	
////		if(this.getRam()> lap2.getRam())
////			return 1;	
////		else 
////			return -1;

//		public int compareTo(Laptop lap1) {
//			Laptop other = lap1;
			
//			return lap1.getMarke().compareTo(this.marke);
//			return this.marke.compareTo(lap1.getMarke());
//			return this.ram - lap1.getRam();
//			return lap1.getRam() - this.ram;
//		}
		
		
		
		
}
