package listEx;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList6 {
   
	public static void main(String args[]) {
		int []numbers= {65,72,67,12,90,87};
		ArrayList al=new ArrayList();
		for(int number:numbers)
		{
			al.add(number);
		}
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		System.out.println(al.get(al.size()-2));
	}
}
