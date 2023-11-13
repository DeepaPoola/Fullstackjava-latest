package SetEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class IteratorEx {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		LinkedHashSet ls = new LinkedHashSet();
		al.add(10);
		al.add("Rahul");
		al.add(true);
		al.add(null);
		LinkedList ll = new LinkedList();
		ll.addAll(al);
		HashSet hs = new HashSet();
        hs.addAll(al);
        
       Iterator obj1 = al.iterator();
       Iterator obj2=  ll.iterator();
       Iterator obj3= hs.iterator();
       
       while(obj1.hasNext()) {
   	   	System.out.println(obj1.next());
      }
       System.out.println("******");
       while(obj3.hasNext()) {
    	   	System.out.println(obj3.next());
       }
        
	}

}
