public class Child extends Parent{
  int salary;
  String loc="AP";
  Child(int id,String name,int salary){
    super(id,name);
    this.salary=salary;
    
  }
  void display(){
    System.out.println(super.loc);
  }
  void m1(){
    super.m1();
    System.out.println("child m1() method");
  }
  public static void main(String args[]){
    Child c=new Child(10,"Sunny",1000);
   
    System.out.println(c.id);
    System.out.println(c.name);
    System.out.println(c.salary);
    c.m1();
    System.out.println(c.loc);
    c.display();
    
  }
}
