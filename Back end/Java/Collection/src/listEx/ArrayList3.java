package listEx;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		//iterate arraylist elements
//		for(int i=0; i<=al.size()-1; i++) {
//			System.out.println(al.get(i));
//		}
//		for(Object value:al) {
//			System.out.println(value);
//		}
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}