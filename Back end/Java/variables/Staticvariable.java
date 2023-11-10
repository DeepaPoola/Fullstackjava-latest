 class Staticvariable {
    static int price=10;
    public static void main(String args[])
    {
       Staticvariable s=new Staticvariable();
       System.out.println(s.price);
       System.out.println(price);
    }
}

//we can access static variable in static method only using object or directly