package listEx;


import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(); //initial Capacity 10 and allowed heterogeneous values
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		//size of your arraylist
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains(10));
		al.add(0,5);
		System.out.println(al);
		al.remove(4);
		//al.clear();
		System.out.println(al.get(0));
		
		
	}
}
