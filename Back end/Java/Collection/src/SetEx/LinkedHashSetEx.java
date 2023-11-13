package SetEx;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(10);
		lhs.add("Rahul");
		lhs.add(true);
		lhs.add(null);
		System.out.println(lhs);
//		for( Object value:lhs) {
//			System.out.println(value);
//		}
		Iterator itr= lhs.iterator();
	       
	       while(itr.hasNext()) {
	   	   	System.out.println(itr.next());
	      }
	}

}