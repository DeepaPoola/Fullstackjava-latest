package DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class DateEx {
   public static void main(String args[])
   {
	   LocalDate date=LocalDate.now();
	   System.out.println(date);
	   LocalTime time=LocalTime.now();
	   System.out.println(time);
	   int year=date.getYear();
	   Month month=date.getMonth();
	   System.out.println(month);
	   int month1=date.getMonthValue();
	   int dd=date.getDayOfMonth();
	   System.out.println(dd+":"+month1+":"+year);
	   System.out.println(dd+"/"+month1+"/"+year);
	   int h=time.getHour();
	   int m=time.getMinute();
	   int s=time.getSecond();
	   int n=time.getNano();
	   System.out.printf("%d:%d:%d:%d",h,m,s,n);
	   
   }
}
