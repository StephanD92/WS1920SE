package T01_20190409;

public class Professor extends Hochschulangehoeriger{
	
	private String lehrgebiet;

	public Professor(String name, String vorname, String lehrgebiet) {
		super(name,vorname);
		this.lehrgebiet = lehrgebiet;
	}

	public String getLehrgebiet() {
		return lehrgebiet;
	}

	public void setLehrgebiet(String lehrgebiet) {
		this.lehrgebiet = lehrgebiet;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + this.lehrgebiet;
	}
	
	

}
