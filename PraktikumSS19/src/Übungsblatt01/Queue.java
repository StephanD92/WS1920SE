package �bungsblatt01;

public interface Queue<T> {			// T f�r Generics, damit es typsicher ist
	public void enqueue(T o);   // o f�r Objekt, mann kann auch einen anderen buchstaben nehmen oder auch ein wort
	public T dequeue();     // ohne void weil kein R�ckgabewert
	
	
	// 1. Zeile = void rein, 2.Zeile = ohne void raus
}
