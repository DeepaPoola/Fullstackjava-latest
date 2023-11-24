package DateTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneTimeEx {
	public static void main(String args[])
	 {
		 ZoneId zone=ZoneId.systemDefault();
		 System.out.println(zone);
		 ZoneId india=ZoneId.of("Asia/Calcutta");
		 ZonedDateTime indiaZoneDateTime= ZonedDateTime.now(india);
			System.out.println(indiaZoneDateTime);
			
			ZoneId ca= ZoneId.of("America/Los_Angeles");
			ZonedDateTime zt= ZonedDateTime.now(ca);
			System.out.println(zt);
	 }
}
