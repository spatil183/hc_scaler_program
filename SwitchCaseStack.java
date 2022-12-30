package hc_Scaller_Program;

import java.util.Scanner;

public class SwitchCaseStack {

	public static void stackFunctioning() {
		CustomStack stack = new CustomStack();
		Scanner in = new Scanner(System.in);
		int input;
		String choice = null;
		
	do {
	System.out.println("!! Opeations on Stack !!");
	System.out.println(" 1. push() Method");
	System.out.println(" 2. pop() Method");
	System.out.println(" 3. peek() Method");
	System.out.println(" 4. Exit the Method");
	System.out.println(" choose the Method");
	
	input = in.nextInt();
	switch(input) {
	case 1 : System.out.println(" please enter the how many values push in stack");
             int n = in.nextInt();
             System.out.println("enter"+ n + "vales");
             for(int i = 0; i < n; i++) {
            	 stack.push(in.nextInt());
             }
             System.out.println(" Stack Data ->");
             stack.display();
             break;
             
	case 2 : System.out.println(" Method of pop()"+ stack.pop());
	         break;
	
	case 3 : System.out.println(" method Of peek()"+ stack.peek());
	         break;
	
	case 4 : choice = "N";
	         break;
	         
	default : System.out.println(" You have Enter the invalid Input");
	}
	if(choice == null) {
		System.out.println("Can you continue this methods on Stacks ? yes or no");
		choice = in.next();
	}
	}
	while(choice.equalsIgnoreCase("yes"));
	System.out.println(" !! Operations ends of Stack !!");
	}
	
//	public static void main(String[] args) {
//		stackFunctioning();
//	}
}
