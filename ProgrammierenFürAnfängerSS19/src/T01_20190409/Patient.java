package T01_20190409;

public class Patient {

	private String name;
	
	public Patient(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Patient: " + name ;
	}
	
	
}
