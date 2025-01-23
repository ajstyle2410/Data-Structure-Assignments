package traverse.singly.list;

class Search {

	public boolean serchElement(Node head,int target) {
		while (head != null) {
			if (head.data == target)
				return true;

			head = head.next;
		}
		return false;
	}
}

public class Searching {
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		
		Search s = new Search();
		boolean b=s.serchElement(head,300);
		
		if(b)
			System.out.println(true);
		else
			System.out.println(false);
		
	}
}
