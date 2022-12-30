package hc_Scaller_Program;

public class CustomLinkedList {

	Node head;
	Node tail;
	int size;
	
	public CustomLinkedList() {
		this.size=0;
	}
	class Node{
		int value;
		Node next;
		
		public Node(int value) {
			this.value=value;
		}
		
		public Node(int value, Node next) {
			this.value=value;
			this.next=next;
		}
	}
	
	public void insertNodeAtHead(int value) {
		Node node = new Node(value);
		node.next=head;
		head = node;
		
		if(tail==null) {
			tail = head;
		}
		size++;
	}
	
	public void insertNodeAtTail(int value) {
		if(tail==null) {
			insertNodeAtHead(value);
			return;
		}
		Node node = new Node(value);
		tail.next=node;
		tail=node;
		size++;
	}
	
	public void insertAtIndex(int value, int index) {
		if(index == 0) {
			insertNodeAtHead(value);
			return;
		}
		if(index == size) {
			insertNodeAtTail(value);
			return;
		}
		
		Node temp = head;
		for(int i=1; i<index; i++) {
			temp = temp.next;
		}
		
		Node node = new Node(value, temp.next);
		temp.next = node;
	}
	
	public int deleteFirst() {
		int value = head.value;
		head = head.next;
		if(head == null) {
			tail = null;
		}
		size--;
		return value;
	}
	
	public int deleteLast() {
		if(size <= 1) {
			return deleteFirst();
		}
		
		Node secondLast = get(size-2);
		int value = tail.value;
		tail = secondLast;
		tail.next = null;
		return value;
	}
	
	public int delete(int index) {
		if(index == 0) {
			return deleteFirst();
		}
		if(index == size-1) {
			return deleteLast();
		}
		
		Node previous = get(index-1);
		int value = previous.next.value;
		previous.next = previous.next.next;
		return value;
	}
	
	public Node get(int index) {
		Node node = head;
		for(int i=0; i<index; i++) {
			node = node.next;
		}
		return node;
	}
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
		System.out.println("END");
	}
	
//	public static void main(String args[]) {
//		CustomLinkedList ll = new CustomLinkedList();
//		ll.insertNodeAtHead(4);
//		ll.insertNodeAtHead(5);
//		ll.insertNodeAtHead(6);
//		ll.insertNodeAtHead(89);
//		ll.insertNodeAtHead(22);
//		ll.insertNodeAtTail(43);
//		ll.display();
//		ll.insertAtIndex(234, 3);
//		ll.display();
//		System.out.println(ll.deleteFirst());
//		ll.display();
//		System.out.println(ll.deleteLast());
//		ll.display();
//		System.out.println(ll.delete(2));
//		ll.display();
//	}
	
}
