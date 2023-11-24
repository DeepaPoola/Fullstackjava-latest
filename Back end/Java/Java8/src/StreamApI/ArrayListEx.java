package StreamApI;

import java.util.ArrayList;

public class ArrayListEx {
  public static void main(String args[]) {
	  ArrayList<Integer> prices=new ArrayList<Integer>();
	  prices.add(399);
	  prices.add(199);
		prices.add(299);
		prices.add(99);
		prices.add(599);
		System.out.println(prices);
		ArrayList<Integer> newPrices=new ArrayList<Integer>();
		for(Integer i:prices) {
			if(i>200) {
				newPrices.add(i);
			}
		}
		System.out.println(newPrices);
  }
}
