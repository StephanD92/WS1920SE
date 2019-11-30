package T01_20190409;

public abstract class Hochschulangehoeriger {
	
	private String name;
	private String vorname;

	public Hochschulangehoeriger(String name, String vorname) {
		this.name = name;
		this.vorname = vorname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	@Override
	public String toString() {
		return this.name + ", " + this.vorname;
	}
	
	

}
