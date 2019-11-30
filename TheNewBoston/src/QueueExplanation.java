import java.util.*;

import javax.rmi.ssl.SslRMIClientSocketFactory;


public class QueueExplanation {

	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<String>();
		// priority Queue vom typ string erstellt
		// priority queue arbeitet wie schlage im Supermarkt
		// wer zuerst da war wird als erstes bedient und umgekehrt
		q.offer("first");
		q.offer("second");
		q.offer("third");	
		q.offer("xletzte");
		q.add("first");
		
		
		// gibt q aus welches eine priority queue ist
		System.out.printf("%s ",q);
		System.out.println();
		
		// gibt mir element in Queue mit höchter priorität 
		System.out.printf("%s ",q.peek());
		System.out.println();
				
		// poll = methode die element mit höchster prirität sucht
		// und automatisch entfernt
		
		q.poll(); // anwenden der Methode poll
		System.out.printf("%s ",q);  //ausgabe der Queue nach anwendne
		System.out.println();
		
		// gibt das wichtigste element aus und entfernt es
		System.out.println(q.poll());
		
		//gibt mir nochmal die QUeue aus (man sieht das das
		// element in methode davor entfernt wurde
		System.out.println(q);
	}

}
