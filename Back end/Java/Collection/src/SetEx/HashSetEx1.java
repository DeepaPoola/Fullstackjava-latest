package SetEx;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {

	public static void main(String[] args) {
		//HashSet hs = new HashSet(50, 0.50f); initial capacity 50, and fill raio/load factor is .50
		HashSet hs1 = new HashSet(); //initial capacity 100 and fill ratio is 0.75
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("Sonia");
		hs2.add("Priyanka");
		hs1.add(100);
		hs1.add(200);
		hs1.add(100);
		hs1.add(true);
		hs1.add("Rahul Gandhi");
		hs1.add(null);
		System.out.println(hs1);
		hs1.addAll(hs2);
		System.out.println(hs1);
		
		System.out.println(hs1.isEmpty()); //false
//		for( Object v:hs1) {
//			System.out.println(v);
//		}
		System.out.println("**Iterating using iterator -");
		Iterator obj = hs1.iterator();
		while(obj.hasNext()) {
			System.out.println(obj.next());
		}
		
		

	}

}
