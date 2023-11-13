package listEx;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayList4 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		//allowed duplicate, heterogeneous, and insertion order is preserving
		al.add(100);
		al.add(2);
		al.add(300);
		al.add(40);
		Collections.sort(al);//default sort ins Natural sorting order
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
	}

}