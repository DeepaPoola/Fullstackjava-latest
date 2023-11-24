package LambdaEx;

public class Demo {
   public static void main(String args[]) {
	   String name="Rahul";
	   Runnable r1=()->{System.out.println(name);};
    r1.run();
   }
}
