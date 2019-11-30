package T01_20190409;

public class Warteschlange<T> {
	
	private Node<?> root;
	private Node<?> last;
	private Node<?> current;

	public Warteschlange() {
		this.root = new Node(null);
		this.last = root;
	}
	
	public boolean isEmpty() {
		return root == last;
	}

	
	public void neuerPatient(T element) {
		Node<T> node = new Node<T>(element);
		last.setNext(node);
		last = node;
	}

	
	public T naechsterPatient() {
		current = root.getNext();
		if(current == null)
			return null;
		root = current;
		return (T) current.getData();
	}
	

}
