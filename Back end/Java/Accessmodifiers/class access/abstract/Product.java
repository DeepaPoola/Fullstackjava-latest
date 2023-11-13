abstract class Product
{
    public void m1(){
        System.out.println("Concrete m1() method");
    }
    public abstract void m2();
}
class Test extends Product{
  public void m2(){
    System.out.println(" non concrete method implementation");
  }
  public static void main(String args[])
  {
    Test t=new Test();
    t.m1();
    t.m2();
  }
}
//abstract can't create object