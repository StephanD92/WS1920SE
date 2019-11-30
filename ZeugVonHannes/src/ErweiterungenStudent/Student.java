package ErweiterungenStudent;

public class Student extends Person {
	private int matnr;
	private int cp;
	public Student(String vorname, String nachname, String geburtsdatum, int matnr, int cp) {
		super(vorname, nachname, geburtsdatum);
		this.matnr = matnr;
		this.cp = cp;
	}
	public Student() {
		this("---","---","---",0,0);
		// TODO Auto-generated constructor stub
	}
	public int getMatnr() {
		return matnr;
	}
	public void setMatnr(int matnr) {
		this.matnr = matnr;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String toString()
	{
		return super.toString() + " " + matnr + " " + cp;
	}
	
	

}
