package StreamApI;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marks =new ArrayList<Integer>();
		marks.add(36);
		marks.add(46);
		marks.add(26);
		marks.add(16);
		Stream s=marks.stream();
		Object[] obj=s.toArray();
		//Integer[] i= (Integer[]) s.toArray(Integer[]::new);
		for(Object x : obj) {
			System.out.println(x);
		}
	}

}
