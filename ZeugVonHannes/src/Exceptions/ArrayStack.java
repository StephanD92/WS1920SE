package Exceptions;

public class ArrayStack<T> implements Stack<T> {

	private T[] data;
	private int counter = 0;
	
	public ArrayStack(int max) {
		data = (T[]) new Object[max];
	}

	public void push(T item) throws StackIsFullException {
		if(counter == data.length)
			throw new StackIsFullException();
		data[counter] = (T) item;
		counter++;
		StackIsFullException.setStacksize(counter);
	}

	public T pop() throws StackIsEmptyException {
		if ( counter == 0 )
			throw new StackIsEmptyException();
		counter--;
		
		return data[counter];
	}

	public boolean empty() {
		return counter == 0;
	}
	
	public int getSize() {
		return ++counter;
	}
	
	
}
