package LambdaEx;
 
@FunctionalInterface
interface TestInterface{
	public abstract void m1();
}
public class Test2 {
  static TestInterface ti=()->{System.out.println("Hello");};
  public static void main(String args[]) {
	  ti.m1();
  }
}
