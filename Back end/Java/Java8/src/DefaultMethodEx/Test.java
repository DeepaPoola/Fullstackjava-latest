package DefaultMethodEx;

interface Interface1{
	public abstract void m1();
	public abstract void m2();
	default void m3() {
		System.out.println("Interface Default method");
	}
		
	
}
public class Test implements Interface1{
	public static void main(String[] args) {
		Test t = new Test();
		t.m3();
		t.m1();

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("M1 method");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
}
