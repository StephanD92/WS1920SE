package Übungsblatt01;

import java.util.ArrayList;
import java.util.List;

public class TestHandeslware {
	
	public static void main(String[] args) {
	 
		List<Handelsware> bestand = new ArrayList<Handelsware>();
		
		// handelsware ist nur interface
		
		bestand.add(new Artikel("Computer", 1123, 1099.99));
		bestand.add(new Lebensmittel("Banane", 897987, 0.99, 5555));
		bestand.add(new Lebensmittel("Pudding", 443322, 2.99, 5419));
		
		for(Handelsware b : bestand)
			System.out.println(b);

		
		
	}

}
