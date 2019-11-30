package WiederholungsStunde;

import java.util.Comparator;

public class AktivUndNamensComparator implements Comparator<T> {

	
	public int compare(T arg0, T arg1) {
		if(arg0.aktiv) {
			if(!arg1.aktiv) {
				return -1;
			} else {
				return this.name.compareTo(arg0.name);
			}
		} else {
			if(arg1.isaktiv) {
				return 1;
			} else {
				return arg0.getName().comparteTo(arg1.getName());
			}
			
		}
	}
}
