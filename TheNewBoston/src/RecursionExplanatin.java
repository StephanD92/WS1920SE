
public class RecursionExplanatin {

	// Fakultät! factorial
	// 5!  = 5*4*3*2*1  = 120
	// 3! = 3*2*1 = 6
	
	
	public static void main(String[] args) {
		
		// Methode die Methode nutzt
		System.out.println(fact(5));
		System.out.println(fact(6));
		System.out.println(fact(7));
	}
	
	
	
	
	// Methode die Rekursion nutzt um Fakultät (factorial) zu errechnen. 
	// methode ruft sich selber auf (else teil) bis der base case (return 1) erreicht ist.
	// methode speichert Zwischenergebnisse.
	public static long fact (long n) {
		if(n <=1)
			return 1; // base case. geht dahin zurück
		else 
			return (n * fact(n-1)); 
		// ruft sich selber mit einem anderen Paramaeter auf
	}
	
	
	
}
