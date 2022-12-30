package hc_Scaller_Program;

public class CustomArray { 

	int[] data;
	int size;
	
	public CustomArray() {
		size = 0;
		data = new int[6];
	}
	
	public void insert(int ele) {
		if(size == data.length) {
			increseArrayCapacity();
			data[size] = ele;
		}
		data[size++] = ele;
	}
	
	public void increseArrayCapacity() {
		int newSize = data.length*2;
		int[] temp = new int[newSize];
		for(int i=0;i<data.length;i++) {
			temp[i]=data[i];
		}
		data = temp;
		}
	
	public void addFirst(int ele) {
		
		for(int i=size; i>0; i--) {
			data[i]= data[i-1];
		}
		data[0] = ele;
		size++;
	}
	

	
	public void deleteAt(int index) {
		int [] temp = new int[data.length-1] ;
		
		int cnt=0;
		for(int i= 0 ; i <temp.length ;i++)
		{
		if(i!=index)
			temp[cnt++]=data[i];
		else
		{
			temp[cnt++]=data[i+1];
			break;
		}
		}
		for(int i=0 ; i <temp.length ; i++)
		{
			System.out.print(temp[i]+" ");
		}
	}

	public Object get(int index) {
		return data[index];
	}
	
	public int getSize() {
		return data.length;
	}
	
	
	
	public void display() {
		for(int i = 0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println("END");
	}
	
//	public static void main(String[] args) {
//		CustomArray arr = new CustomArray();
//		arr.insert(12);
//		arr.insert(14);
//		arr.insert(19);
//		arr.insert(4);
//		arr.insert(23);
//		arr.display();
//		System.out.println(arr.getSize());
//	    arr.display();
//		System.out.println(arr.get(4));
//		arr.display();
//		arr.addFirst(233);
//		arr.display();
//		arr.deleteAt(3);
//	}
}
