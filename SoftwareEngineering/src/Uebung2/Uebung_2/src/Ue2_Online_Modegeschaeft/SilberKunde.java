package Uebung2.Uebung_2.src.Ue2_Online_Modegeschaeft;

public class SilberKunde extends Kunde{

	
	public SilberKunde(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	private double rabatt = 0.1;
	
	
	public double getRabatt() {
		return rabatt;
	}
	
	public void setRabatt(double rabatt) {
		this.rabatt = rabatt;
	}
	
	
	@Override
	public int getKundenId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setKundenID(int kundenID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNachname() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNachname(String nachname) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getVorname() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setVorname(String vorname) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Warenkorb getWarenkorb() {
		// TODO Auto-generated method stub
		return null;
	}

}
