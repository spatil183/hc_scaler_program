package hc_Scaller_Program;

import java.util.Scanner;

public class SwitchCaseLinkedList {
	public static void linkedListFunctioning() {
		CustomLinkedList list = new CustomLinkedList();
		Scanner sc = new Scanner(System.in);
		int input;
		String choice = null;
	
    do {
    	System.out.println(" !! Operations for LinkedList !!");
    	System.out.println(" 1. for Add Node at Tail");
		System.out.println(" 2. for Add Node at head");
		System.out.println(" 3. for Insert using Index");
		System.out.println(" 4. for Display all added Data");
		System.out.println(" 5. for Delete at First");
		System.out.println(" 6. for Delete at Last");
		System.out.println(" 7. for Delete using Index");
		System.out.println(" 8. for Exit the Methods");
		System.out.println(" Choose method");
		
		input = sc.nextInt();
		switch(input) {
		case 1 : System.out.println(" please enter the how many values push in Linked List");
	             int n = sc.nextInt();
	             System.out.println("enter"+ n + "vales");
	             for(int i = 0; i < n; i++) {
	            	 list.insertNodeAtTail(sc.nextInt());
	             }
	             System.out.println("Linked List ->");
	             list.display();
	             break;
	             
		case 2 : System.out.println("Values to be inserted");
		        list.insertNodeAtHead(sc.nextInt());
		        list.display();
		        break;
		        
		case 3 : System.out.println("Values to be inserted at index");
		        list.insertAtIndex(sc.nextInt(), sc.nextInt());
		        list.display();
		        break;
		        
		case 4 : System.out.println("Display the all values t be inserted in LinkedList");
		        list.display();
		        break;
		        
		case 5 : System.out.println("Values to be delete at first");
		        System.out.println(list.deleteFirst());
		        list.display();
		        break;
		        
		case 6 : System.out.println("Values to be delete at last");
		        System.out.println(list.deleteLast());
		        list.display();
		        break;
		        
		case 7 : System.out.println("Values to be delete at using index");
		        System.out.println(list.delete(sc.nextInt()));
		        list.display();
		        break;
		        
		case 8 : choice = "N";
		        break;
		        
		default : System.out.println("You have entered the wrong input");        
    }
		if(choice == null) {
			System.out.println("Can you repeat the operations to Linked List?? yes/ no ");
			choice = sc.next();
		}
	}
    while(choice.equalsIgnoreCase("Yes"));
    System.out.println("!! Operations ends On Linked List !!");
	}
}
