class Test {
public static void main(String[] args) {
	
	Test e1 = new Test();
	Test e2 =new Test();
	System.out.println(e1.equals(e2));//false
	
	String s1 = new String("Rahul Gandhi");
	String s2 = new String("Rahul Gandhi");
	String s3 =s1;
    String s4="Sunny";
    String s5="Sunny";
	System.out.println(s1.equals(s2));//true
	System.out.println(s1.equals(s3));//true
	System.out.println(s4.equals(s5));//true
	System.out.println(s1 == s2); //false
	System.out.println(s4 == s5); //true
    
}
}


/*public class Test {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a == b);//false
		
		String name="Rahul Gandhi";
		String ename=new String("Rahul Gandhi");
		System.out.println(name.equals(ename)); //true
		
	    System.out.println(name == ename);//false
	    
	Test t1=new Test();
		Test t2= new Test();
		System.out.println(t1.equals(t2));//false

	}

}*/
//equals method in string class override object class equals method and check content and it is true for both string object and string literal
//equal operator is false for string object using new and true for string literal because for string object it will create separate memory
