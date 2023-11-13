package pack1;
//import pack1.A;
 class B {
    public static void main(String args[]){
      A a = new A();
      //a.m1(); private - within the class
      a.m2();// public - anywhere
      a.m3();//protected - within the package  + outside the package with help of child reference
      a.m4();//default- within the package
    }
}
