package traverse.singly.list;

class Traverseing {

	Node head;

	public void setNode(Node head) {
		this.head = head;
	}

	public void displayNode() {
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

}

public class TraversingSinglyList {

	public static void main(String[] args) {

	Node head =new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);


		Traverseing t = new Traverseing();
		t.setNode(head);
		t.displayNode();

	}

}
