package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComp {
   public static void main(String args[])
   {
	   //TreeSet ts=new TreeSet();
	   TreeSet ts= new TreeSet(new MyComp());
		ts.add("Sonia");
		ts.add("Rahul");
		ts.add("Priyanka");
		System.out.println(ts);
		String s ="Hello";
   }
}
class MyComp implements Comparator{
	public int compare(Object o1,Object o2)
	{
		System.out.println(o1);
		//System.out.println(o2);
		String s1=(String)o1;
		String s2=(String)o2;
		return s2.compareTo(s1);
	}
}
