package traverse.singly.list;

class Insert {
	Node addNode(Node head, int value) {
		Node newNode = new Node(value);

		newNode.next = head;
		head = newNode;

		return head;

	}
}

public class BiginingInserting {
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		
		Insert insert =new Insert();
		Node addedNode=insert.addNode(head, 70);
		
		 while(addedNode!=null)
		 {
			 System.out.println(addedNode.data);
			 addedNode=addedNode.next;
		 }
		
	}

}
