package listEx;

import java.util.ArrayList;
import java.util.HashSet;

public class AltoHsEx {
  public static void main(String args[])
  {
	  ArrayList al=new ArrayList();
	  al.add(10);
	  al.add(10);
	  al.add(20);
	  al.add("Twenty");
	  HashSet hs=new HashSet();
	  hs.addAll(al);
	  System.out.println(hs);
	  System.out.println(al);
  }
}
