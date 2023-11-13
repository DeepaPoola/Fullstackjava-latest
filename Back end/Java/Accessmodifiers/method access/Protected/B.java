package pack2;

import pack1.A;

class B extends A{
public static void main(String[] args){
	B b  = new B();
	b.m3();
   
    //default- within the package
    //public - access anywhere
    //protected - within & outside package with child reference 
    //private - within class
}
}