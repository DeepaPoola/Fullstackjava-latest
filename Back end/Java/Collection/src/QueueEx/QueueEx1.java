package QueueEx;

import java.util.PriorityQueue;

public class QueueEx1 {
  public static void main(String args[])
  {
	  PriorityQueue pq=new PriorityQueue();
	  pq.add("Rahul");
	  pq.add("sonia");
	  pq.add("Priyanka");
	  pq.offer("Robert");
	//pq.add("Rahul@gmail.com");//Heterogenous Data Not Allowed
    System.out.println(pq);
    System.out.println(pq.element());
    System.out.println(pq.peek());//print first element
  }
}
