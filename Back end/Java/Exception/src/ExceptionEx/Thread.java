package ExceptionEx;

public class Thread {
	public static void main(String[] args) throws InterruptedException{
		getData(null);
	}
	public static void getData(String s) {
		System.out.println(s.toLowerCase());
		//Thread.sleep(5000);
	}
}
