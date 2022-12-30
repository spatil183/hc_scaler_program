package hc_Scaller_Program;

import java.util.Scanner;

public class SwitchCase {
	Scanner sc = new Scanner(System.in);
	int input;
	String choice = null;

	public void display() {

		do {
			System.out.println("The Data Structures");
			System.out.println("1. ArrayList");
			System.out.println("2. LinkedList");
			System.out.println("3. Stack");
			System.out.println("4. Queue");
			System.out.println("5. For Exit");
			
			System.out.println(" Select the DS ");
			input = sc.nextInt();
			
			switch (input) {
			case 1: SwitchCaseArray.arrayFunctioning();
				break;
				
			case 2: SwitchCaseLinkedList.linkedListFunctioning();
				break;

			case 3: SwitchCaseStack.stackFunctioning();
				break;

			case 4: SwitchCaseQueue.queueFunctioning();
			     break;

			case 5: choice = "N";
			     break;
			     
			default:
				System.out.println(" You have Enter Invalid Input");
			}
			System.out.println(" You have repeat the operations?yes/no");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("yes"));
		System.out.println("!! EXIT OPERATIONS!! ");

	}

	public static void main(String[] args) {
		SwitchCase s = new SwitchCase();
		s.display();
	}
}
