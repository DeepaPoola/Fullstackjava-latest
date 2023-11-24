package StreamApI;

import java.util.ArrayList;

public class StreamCountEx {
	public static void main(String[] args) {
		ArrayList<Integer> marks =new ArrayList<Integer>();
		marks.add(36);
		marks.add(46);
		marks.add(26);
		marks.add(16);
		//long noOfStudents= marks.stream().filter((mark)->{return mark>=35;}).count();
		long noOfStudents= marks.stream().filter(mark->mark>=35).count();
		System.out.println(noOfStudents);
	}
}
