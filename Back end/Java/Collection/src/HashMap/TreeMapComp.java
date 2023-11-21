package HashMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapComp {
	public static void main(String[] args) {
		//TreeMap t = new TreeMap(new MyComp());
		TreeMap t = new TreeMap();
		t.put("id", "101");
		t.put("name", "Rahul");
		t.put("avg", 55);
		System.out.println(t);
	}
}
class MyComp implements Comparator{
	 public int compare(Object o1, Object o2) {
		 System.out.println(o1);
		 String s1 = (String) o1;
		 String s2 = (String) o2;
		 return s2.compareTo(s1);	
	 }
}
