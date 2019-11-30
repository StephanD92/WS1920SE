package Übungsblatt03;

public class ArrayStack <T> implements Stack<T>{
	
	
	private T[] data;
	private int pos = 0;
	
	public ArrayStack(int size ) {
		data = (T[]) new Object[size];
	}
	
	public T push(T elem) {
		data [pos++] = elem;
	}

	public T pop() {
		return data[--pos];
	}
	
	public boolean isEmpty() {
		return pos <= 0;
	}
	
	
	
}
