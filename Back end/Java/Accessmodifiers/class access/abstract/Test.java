abstract class Test{
    public abstract void m1();
    /*Test t=new Test();
    System.out.println(t);//we cannot create object for abstract class*/
}
class Demo extends Test{
    public void m1(){
        System.out.println("Hello m1()");
    }
    public static void main(String args[])
    {
        Demo t=new Demo();
        t.m1();
        Test t1=new Demo();//Parent can hold child object
        t1.m1();

    }
}
//compile - javac Test.java
//run - java Demo
