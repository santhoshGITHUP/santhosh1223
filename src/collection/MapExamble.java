package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExamble {
	public static void main(String[] args) {
		System.out.println("===== Hash Map=====");
		Map<String,Integer> m1= new HashMap();
		m1.put("CSk", 12);
		m1.put("RR", 14);
		m1.put("DC", 16);
		m1.put(null, 34);
		m1.put(null, 87);
		System.out.println(m1);
		Integer integer = m1.get("RR");   // get the given number
		System.out.println(integer);
		System.out.println("===== linked Hash Map====");
		Map<String , Integer> m2= new LinkedHashMap<String, Integer>();
		m2.put("santhosh", 1);
		m2.put("sanjai", 2);
		m2.put("hari", 3);
		System.out.println(m2);
		//m1.remove("RR");
		//System.out.println(m1);
		m2.putAll(m1);
		System.out.println(m2);
		System.out.println("using collection");
		Collection<Integer> values = m1.values();   /// get the given values
		System.out.println(values);
		Set<String> keySet = m1.keySet();
		System.out.println(keySet);       /// given  the keys

		Set<Entry<String,Integer>> entryset= m1.entrySet();    
		
		
		for(Entry a: entryset) {
			Object key = a.getKey();
			System.out.println(key);
			Object value = a.getValue();
			System.out.println(value);
		}




	}
}
