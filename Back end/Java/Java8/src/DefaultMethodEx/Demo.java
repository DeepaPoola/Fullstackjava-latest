package DefaultMethodEx;

interface I{
	default void m1() {
		System.out.println("Interface1 default method");
	}
}
interface I1{
	default void m1() {
		System.out.println("Interface2 - default Method");
	}
}
public class Demo implements I,I1 {
   public void m1() {
	   System.out.println("Class Demo - m1 method");
   }
   public static void main(String args[])
   {
	   Demo d=new Demo();
	   d.m1();

   }
}
