package FunctionandPredicateInterface;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
    static Function<Integer,Integer> f=(a)->{return a*a;};
    static Predicate<Integer> p=i->1%2==0;
    public static void main(String args[])
    {
    	System.out.println(f.apply(10));
    	System.out.println(p.test(10));
    }
}
