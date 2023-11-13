final class Parent {
   
}
/*class Child extends Parent{

} we cannot create child for final class*/
class Test{
    public static void main(String args[]){
    Parent p=new Parent();
    System.out.println(p);
    }
}
/*
 final - class, method, variable
 class- we cannot create child. no inheritance
 method- we can't overide 
 variable- we can't modify
 */
/*
 static- methods, variables
 static -class level
 static method-we can access directly/ with help of class name
 static methods,static variable = class level
 */
