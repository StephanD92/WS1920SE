package Exceptions;

public class StackIsFullException extends StackException {
	private static int stacksize;
	public String getMessage() {
		return "This Stack is Full! At the Moment it holds " + this.stacksize + " items.";
	}
	public static void setStacksize(int x) {
		stacksize = x;
	}
	
}
