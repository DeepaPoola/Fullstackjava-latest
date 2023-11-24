package StreamApI;

import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Stream s= Stream.of(10,20,30,40,50);
   s.forEach((i)->{System.out.println(i);});
   Double[] prices = {299.00, 399.00, 499.00};
	Stream s1 = Stream.of(prices);
	s1.forEach((price)->{System.out.println(price);});
}
}
