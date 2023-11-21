package EnumEx;

enum Month {
	JAN,FEB,MARCH,APRIL;
}

class MonthEx{
		public static void main(String[] args) {
			Month[] m =Month.values();
			for(Month m1:m) {
				System.out.println(m1 + "....."+m1.ordinal());
			}
		}
}