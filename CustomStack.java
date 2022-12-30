package hc_Scaller_Program;
public class CustomStack {

	int[] data;
	private static final int DEFAULT_SIZE = 9;
	int pointer = -1;
	
	public CustomStack() {
		this(DEFAULT_SIZE);
	}
	
	public CustomStack(int size) {
	 this.data = new int[size];
	}
	
	public boolean push(int number) {
		if(isFull()) {
		int[] temp = new int [data.length*2];
		
		for(int i=0; i<data.length;i++) {
			temp[i]=data[i];
		}
		data = temp;
		}
		
		pointer++;
		data[pointer] = number;
		return true;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		return data[pointer--]; 
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		return data[pointer];
	}
	
	public boolean isFull() {
		return pointer == data.length-1;
	}
	
	public boolean isEmpty() {
		return pointer == -1;
	}
	
	public void display() {
		for(int i=0;i<=pointer;i++) {
			System.out.print(data[i]+",");
		}
		System.out.println("END");
	}
	
//	public static void main(String[] args) {
//		CustomStack cs = new CustomStack();
//		cs.push(34);
//		cs.push(35);
//		cs.push(38);
//		cs.push(13);
//		cs.push(45);
//		cs.push(25);
//		cs.display();
//		System.out.println(cs.popZ());
//		cs.display();
//		System.out.println(cs.peek());
//		System.out.println(cs.isFull());
//		System.out.println(cs.isEmpty());
//	}
}
