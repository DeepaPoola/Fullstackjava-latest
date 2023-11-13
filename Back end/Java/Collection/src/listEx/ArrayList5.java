package listEx;

import java.util.ArrayList;

public class ArrayList5 {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		//allowed duplicate, heterogeneous, and insertion order is preserving
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		
		ArrayList al2 = new ArrayList();
		ArrayList al3 = new ArrayList();
		al3.add(null);
		al2.add(40);
		al2.add(30);
		al2.add(50);
		
		al2.add(60);
		
		al1.addAll(al2);
		al2.addAll(al3);
		al1.removeAll(al2);
		System.out.println(al1);
	}

}
