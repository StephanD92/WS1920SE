package T01_20190409;

public class Node<T>{
	
	private T data;
	private Node<?> next;
	
	public Node(T data) {
		this.data = data;
		this.next = null;
	}
	
	public Node<?> getNext() {
		return this.next;
	}
	
	public void setNext(Node<?> next) {
		this.next = next;
	}
	
	public T getData() {
		return this.data;
	}
	
	public void setDtata(T data) {
		this.data = data;
	}

}
