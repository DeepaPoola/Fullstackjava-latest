package FunctionandPredicateInterface;

import java.util.function.Function;

public class FunctionEx {
  static Function<String,Integer>f=s->s.length();
  public static void main(String args[]) {
	  System.out.println(f.apply("Rahul Gandhi"));
  }
}
