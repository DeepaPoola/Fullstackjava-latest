package pack2;
import pack1.A;
class B{
    public static void main(String args[])
    {
        A a = new A();
        //a.m1(); private method cannot access outside the class
        a.m2();
        //a.m3();protected - access within package and outside package with child reference means we have to use extends 
        //a.m4();
       
    }
}
