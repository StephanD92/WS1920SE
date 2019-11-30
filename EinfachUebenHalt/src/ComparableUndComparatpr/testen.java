package ComparableUndComparatpr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class testen {
 
	
	public static void main(String[] args) {
			
		ArrayList<Laptop> Laptops = new ArrayList<Laptop>();
		
		Laptops.add(new Laptop("Dell",16,800));
		Laptops.add(new Laptop("Apple",8,1200));
		Laptops.add(new Laptop("Acer",12,700));
		Laptops.add(new Laptop("Behindert",11,456));
		
		for(Laptop l : Laptops)
			System.out.println(l);
		
		Comparator<Laptop> com = new Comparator<Laptop>() {

			public int compare(Laptop l1, Laptop l2) {
					if(l1.getPreis()>l2.getPreis())
					return 1;
					else
				return -1;
			}	
		};
		
		Collections.sort(Laptops,com);
		System.out.println();
		for(Laptop l : Laptops)
			System.out.println(l);
		
		
		
		
	}
}
