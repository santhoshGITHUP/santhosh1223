package collection;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExamble {
public static void main(String[] args) {
	Map<Integer,String> map= new HashMap<Integer, String>();
	 map.put(1, "santhosh");
	 map.put(2, "soundhar");
	 map.put(3, "mano");
	 map.put(4, "muthu");
	 map.put(5, "sajai");
	 System.out.println(map);
	 System.out.println(map.size());
	System.out.println( map.containsKey(10));
	System.out.println( map.containsValue("mano"));
	System.out.println( map.keySet());
	System.out.println( map.values());
	System.out.println( map.entrySet());
	  System.out.println("===using Entry Set===");

	 
}
}
