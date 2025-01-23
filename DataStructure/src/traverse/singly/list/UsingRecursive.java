package traverse.singly.list;


class Recursion{
	
	void travalsData(Node head)
	{
		
		if(head==null)
		return ;
		
		System.out.println(head.data);
		head=head.next;
		travalsData(head);		
	}
}

public class UsingRecursive {
public static void main(String[] args) {
   Node head =  new Node(10);
   head.next = new Node(20);
   head.next.next=new Node(30);
   head.next.next.next = new Node(40);
   
   Recursion r =new Recursion();
   r.travalsData(head);
}
}
