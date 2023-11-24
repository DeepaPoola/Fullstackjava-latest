package FunctionandPredicateInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateEx {
  static Predicate<Integer> p = (Integer i)->{ return i>=1000;};
 static Predicate<String> p1=s->s.length()>6;
 static Predicate<Collection> p2= c->c.isEmpty();
 
 public static void main(String args[]) {
	 ArrayList<Integer> al=new ArrayList<Integer>();
	 al.add(100);
	 System.out.println(p.test(2000));
	 System.out.println(p.test(200));
		System.out.println(p1.test("Password4545454"));
		System.out.println(p1.test("Pass"));
		
		System.out.println(p2.test(al));
 }
}
