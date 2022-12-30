package hc_Scaller_Program;

public class CustomeQueue {
	int[] data;
	private static final int DEFAULT_SIZE = 10;
	int end = 0;
	
	public CustomeQueue() {
		this(DEFAULT_SIZE);
	}
	
	public CustomeQueue(int size) {
		this.data = new int[size];
	}
	
	public boolean insert(int number) {
		if(isFull()) {
		int[] temp = new int[data.length*2];
		
		for(int i = 0; i<data.length; i++) {
			temp[i] = data[i];
		}
		data = temp;
		}
	data[end] = number;
	end++;
	return true;
    }
	
	public int remove() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		int remove = data[0];
		for(int i = 1; i<end; i++) {
			data[i-1] = data[i];
		}
		end--;
		return remove;
	}
	
	public int front() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		return data[0];
	}
	
	public boolean isFull() {
		return end == data.length;
	}
	
	public boolean isEmpty() {
		return end == 0;
	}
	
	public void disply() {
		for(int i=0; i<end; i++) {
			System.out.println(data[i]+" ");
		}
		System.out.println("END");
	}
//	
//	public static void main(String[] args) {
//		CustomQueue cq = new CustomQueue();
//		cq.insert(76);
//		cq.insert(98);
//		cq.insert(65);
//		cq.insert(45);
//		cq.insert(32);
//		cq.insert(24);
//		cq.insert(14);
//		cq.display();
//		System.out.println(cq.remove());
//		cq.display();
//		System.out.println(cq.front());
//	}

}
