package Übungsblatt01;

public interface Queue<T> {			// T für Generics, damit es typsicher ist
	public void enqueue(T o);   // o für Objekt, mann kann auch einen anderen buchstaben nehmen oder auch ein wort
	public T dequeue();     // ohne void weil kein Rückgabewert
	
	
	// 1. Zeile = void rein, 2.Zeile = ohne void raus
}
