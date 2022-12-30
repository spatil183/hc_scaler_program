package hc_Scaller_Program;

import java.util.Scanner;

public class SwitchCaseArray {
	
	public static void arrayFunctioning() {
		CustomArray array = new CustomArray();
		Scanner sc = new Scanner(System.in);
		int input;
		String choice = null;
		
	do {
	   System.out.println(" !! Operations for Array !!");
	   System.out.println(" 1. for insert() method");
	   System.out.println(" 2. for addFirst() method");
	   System.out.println(" 3. for getSize() method");
	   System.out.println(" 4. for get() method using index ");
	   System.out.println(" 5. for deleteAt() Method using index");
	   System.out.println("Exit methods");
	   System.out.println(" Select The methods");
	   
	   input = sc.nextInt();
	   switch(input) {
	   case 1 : System.out.println("Insert the values from array");
	           int n = sc.nextInt();
	           System.out.println("Enter"+ n +" values");
	           for(int i = 0; i< n; i++) {
	        	   array.insert(sc.nextInt());
	           }
	           System.out.println(" Values from array");
	           array.display();
	           break;
	           
	   case 2 : System.out.println("addFirst");
	           array.addFirst(sc.nextInt());
	           array.display();
	           break;
	           
	   case 3 : System.out.println("getSize"+ array.getSize());
	           array.display();
	           break;
	           
	   case 4 : System.out.println("get "+ array.get(sc.nextInt()));
	           array.display();
	           break;
	           
	   case 5 : System.out.println(" deleteAt");
	           array.deleteAt(sc.nextInt());
	           break;
	           
	   case 6 : choice = "N";
	           break;
	           
	   default : System.out.println(" you enter the Wrong input");
	   }
	   if(choice == null) {
		   System.out.println(" Do you want to repeat the operations again Arrays?? yes/no");
		   choice = sc.next();
	   }
	}
	while(choice.equalsIgnoreCase("Yes"));
	System.out.println("!! Operations ends for Arrays !!");
	}

}
