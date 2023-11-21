package HashMap;

import java.util.HashMap;

public class HashMapEx2 {
  public static void main(String args[])
  {
	  HashMap m= new HashMap();
		m.put("id", 101);
		m.put("name","Rahul Gandhi" );
		m.put("sal", 45000);
		//m.put(null, null);
		
		//m.remove(null);//remove the key:value - entry
		System.out.println(m);
      for(Object key:m.keySet())
      {
    	  System.out.println(m.get(key));
      }
      System.out.println(m.values());
  }
}
