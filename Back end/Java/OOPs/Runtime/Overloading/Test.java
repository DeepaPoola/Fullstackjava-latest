public class Test {
    public void m1(int a)
    {
        System.out.println(a);
    }
    public void m1(int a,int b)
    {
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String args[]){
       Test t=new Test();
       t.m1(30);
       t.m1(10,20);
    }
}
