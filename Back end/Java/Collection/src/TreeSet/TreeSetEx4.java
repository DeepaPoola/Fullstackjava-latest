package TreeSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx4 {
   public static void main(String args[])
   {
	   SortedSet ts=new TreeSet();
	   int[] salary= {65000,72000,45000,35000,80000};
	   for(int sal:salary)
	   {
		   ts.add(sal);
	   }
	   System.out.println(ts);
	   System.out.println(ts.first());
	   System.out.println(ts.last());
	   ts.remove(ts.last());
	   System.out.println(ts);
	   ts.remove(ts.first());
	   System.out.println(ts);
   }
}
