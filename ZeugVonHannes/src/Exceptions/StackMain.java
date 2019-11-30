package Exceptions;

public class StackMain {

	public static void main(String[] args) throws StackIsFullException, StackIsEmptyException {
		Stack<String> test = new ArrayStack<String>(5);
		try{
			test.push("null");
		
		test.push("eins");
		test.push("zwei");
		test.push("drei");
		test.push("vier");
		test.push("fuenf");
		while(true) {
			test.pop();
		}
		}
		catch (StackException e){
			System.out.println(e.getMessage());
		}
	}

}
