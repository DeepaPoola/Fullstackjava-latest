package ExceptionEx;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = null;
				//System.out.println(s.length()); //NullPointerException
				
				//System.out.println();
			int[] a = new int[5];
			System.out.println(a[100]);  //ArrayIndexOutOfBoundsException
				
			String S = new String("Hello");
				Object obj = (Object) S;
				System.out.println(obj); //ClassCastEx
				
				//int score = Integer.parseInt("Hello");//NumberFormatException
				
	}

}
