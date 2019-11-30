package Übungsblatt01;

public class Artikel implements Handelsware{

	public String name;
	public int ArtNr;
	private double preis;
	
	public Artikel(String name, int artNr, double preis){
		this.name = name;
		this.ArtNr = artNr;
		this.preis = preis;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getArtNr() {
		return ArtNr;
	}

	public void setArtNr(int artNr) {
		ArtNr = artNr;
	}

	public double getPreis() {
		return preis;
	}
	
	public void setPreis(double preis) {
		this.preis = preis;
	}

	@Override
	public String toString() {
		return "Artikel:"+ name + "[ArtNr:" + ArtNr + "  Preis:" + preis + "]";
	}


	@Override
	public void getEuroPreis() {
		preis = preis*EUR_USD;
	}
	
	@Override
	public double getDollarPreis() {
		
		return 0;
	}
	
	
	
	
	

}
