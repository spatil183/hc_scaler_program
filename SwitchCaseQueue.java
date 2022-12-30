package hc_Scaller_Program;

import java.util.Scanner;

public class SwitchCaseQueue {
	
	public static void queueFunctioning() {
		CustomeQueue queue = new CustomeQueue();
		Scanner sc = new Scanner(System.in);
		int input;
		String choice = null;
		
		do {
			System.out.println("!! Opeations on queue !!");
			System.out.println(" 1. insert() Method");
			System.out.println(" 2. remove() Method");
			System.out.println(" 3. front() Method");
			System.out.println(" 4. Exit the Method");
			System.out.println(" choose the Method");
			
			input = sc.nextInt();
			switch(input) {
			case 1 : System.out.println(" please enter the how many values push in queue");
		             int n = sc.nextInt();
		             System.out.println("enter"+ n + "vales");
		             for(int i = 0; i < n; i++) {
		            	 queue.insert(sc.nextInt());
		             }
		             System.out.println(" Queue Data ->");
		             queue.disply();
		             break;
		             
			case 2 : System.out.println(" Method of remove()"+ queue.remove());
			         break;
			
			case 3 : System.out.println(" method Of front()"+ queue.front());
			         break;
			
			case 4 : choice = "N";
			         break;
			         
			default : System.out.println(" You have Enter the invalid Input");
			}
			if(choice == null) {
				System.out.println("Can you continue this methods on Queue ? yes or no");
				choice = sc.next();
			}
			}
			while(choice.equalsIgnoreCase("yes"));
			System.out.println(" !! Operations ends on Queue !!");
	}

}
