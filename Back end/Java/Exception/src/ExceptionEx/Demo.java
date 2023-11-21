package ExceptionEx;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
    	 System.out.println(10/0);
     }
     catch(ArithmeticException a)
     {
    	System.out.println(a) ;
     }
     catch(Exception e)
     {
    	 System.out.println(e);
     }
     finally {
    	 System.out.println("Hello");
     }
	}

}
//checked exception - checked by compiler(means involved third party i.e., file,invoking app)
//unchecked exception - unchecked by compiler

