package Exceptions;

public interface Stack<T> {
	public void push(T item) throws StackIsFullException;
	public T pop() throws StackIsEmptyException;
	public boolean empty();
}
