package LambdaEx;

interface InterfaceAdd{
	public void sum(int a,int b);
}
public class Test1 {
  public static void main(String args[])
  {
	  InterfaceAdd i=(int a,int b)->{System.out.println("Sum of :"+(a+b));};
     i.sum(10, 20);
  }
}
