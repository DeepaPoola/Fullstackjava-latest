package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap m=new HashMap();
        m.put("id", 101);
        m.put("name","Rahul Gandhi" );
		m.put("sal", 45000);
		Set s=m.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Map.Entry entry=(Map.Entry) itr.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
