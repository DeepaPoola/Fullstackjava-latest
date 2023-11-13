class Test{
  
}
class Demo{
  public static void main(String args[])
  {
    Test t= new Test();
    Demo d= new Demo();
    Demo d1= new Demo();
    //System.out.println(d==t);//it will give error because it is reference equal so must have same class reference or same type
     System.out.println(t.equals(d));//false - because both are refering to different object and have different address
     System.out.println(d.equals(d1));//false - because both are refering to different object and have different address
     System.out.println(10 ==  10);
  }
}

/*
 equal operator(==)- for primitive and reference
 equal method(equals())- for reference only
 */