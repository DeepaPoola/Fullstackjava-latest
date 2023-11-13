interface A{
    int amount=500;
}
class Test implements A{
    public static void main(String args[])
    { 
        //amount=600;we can't change variable in interface because it is by defaut declare as public,static and final
        System.out.println(amount);
        System.out.println(Test.amount);
    }
}
