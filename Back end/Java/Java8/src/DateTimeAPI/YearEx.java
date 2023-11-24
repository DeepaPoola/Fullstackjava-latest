package DateTimeAPI;

import java.time.Year;

public class YearEx {
	public static void main(String[] args) {
		int year = 2020;
		Year y = Year.of(year);
		if(y.isLeap()) {
			System.out.println("Yes ,Leap Year");
		}
		else {
			System.out.println("No, Not Leap Year");
		}

	}
}
