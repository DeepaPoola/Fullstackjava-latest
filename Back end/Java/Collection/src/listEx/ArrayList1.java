package listEx;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
   public static void main(String args[])
   {
	   ArrayList<Integer> al1=new ArrayList<Integer>();
	   ArrayList<String> al2 =new ArrayList<String>();
	   ArrayList al3=new ArrayList();
	   al1.add(10);
	   al1.add(30);
	   //al1.add(null);
	   al1.add(20);
	   System.out.println(al1);
	   al2.add("Deepa");
	   al2.add("Sunny");
	   al2.add("Poola");
	   System.out.println(al2);
	   al3.addAll(al2);
	   al3.addAll(al1);
	   System.out.println(al3);
	   Collections.sort(al1);
	   System.out.println(al1);
	   
   }
}
