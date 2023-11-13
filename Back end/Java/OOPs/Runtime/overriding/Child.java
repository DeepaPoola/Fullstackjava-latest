public class Child extends Parent {
	public void display(int a) {
        this.id=a;
		System.out.println("Child class display methods");
        System.out.println(id);
	}
	public static void main(String[] args) {
		Child c =new Child();
		c.display(10);
		
	}

}
