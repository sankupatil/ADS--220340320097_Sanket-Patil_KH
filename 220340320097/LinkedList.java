class LinkedList{
	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data= d;
			next= null;
		}
	}
	
	Node reverse(Node new_node){
		Node prev= null;
		Node current= new_node;
		Node next= null;
		
		while(current != null){
			next= current.next;
			current.next= prev;
			prev= current;
			current= next;
		}
		new_node= prev;
		return new_node;
	}
	
	void printList(Node new_node){
		while(new_node != null){
			System.out.println(new_node.data+" ");
			new_node= new_node.next;
		}
		
	}
	
	
	public static void main(String[] args){
		LinkedList ll= new LinkedList();
		
		ll.head=new Node(1);
		ll.head.next= new Node(5);
		ll.head.next.next= new Node(4);
		ll.head.next.next.next= new Node(2);
		ll.head.next.next.next.next= new Node(3);
		
		System.out.println("Elements of LinkedList");
		
		ll.printList(head);
		head= ll.reverse(head);
		
		System.out.println("Revesed Elements of LinkedList");
		ll.printList(head);
	}
}