package StreamApI;

import java.util.ArrayList;

public class PricesMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> prices= new ArrayList<Integer>();
      prices.add(399);
		prices.add(199);
		prices.add(299);
		prices.add(99);
		prices.add(599);
		System.out.println(prices);
		System.out.println(prices.stream().min((a,b)->a.compareTo(b)).get());
		//System.out.println(prices.stream().max((a,b)->a.compareTo(b)).get());
	}

}
