package Aufg3C;

/**
 * @author Stephan D
 * @version 1.0
 * @created 15-Jun-2019 21:39:08
 */
public class Hotel extends Beleg {

	private String bis;
	private String hotelname;
	private String von;

	public Hotel(String beschreibung, int kosten, String hotelname, String von, String bis){
		super(beschreibung,kosten);
		this.bis = bis;
		this.hotelname = hotelname;
		this.von = von;
	}

	public String getBis() {
		return bis;
	}
	public void setBis(String bis) {
		this.bis = bis;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname() {
		this.hotelname = hotelname;
	}
	public String getVon() {
		return von;
	}
	public void setVon(String von) {
		this.von = von;
	}

	public void ausgeben(){
		super.ausgeben();
		System.out.println("[Details:"+hotelname+", von:"+von+", bis:"+bis+"]");
	}
	
//	public void finalize() throws Throwable {
//		super.finalize();
//	}
}//end Hotel