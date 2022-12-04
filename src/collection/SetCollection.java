package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetCollection {
public static void main(String[] args) {
	Set<String> li= new HashSet<String>();
	li.add("santhosh");
	li.add("sanjai");
	li.add("mano");
	li.add("ravi");
	// using iterator
	System.out.println("===== iteratos====");
	Iterator<String> iterator=li.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	li.add("siva");
	Set<String > li2= new LinkedHashSet<String>();
	li2.add("sundhar");
	li2.removeAll(li);
	System.out.println("li2 list.....");
	System.out.println(li2);
	System.out.println("=== for each====");
	for(String a:li) {
		System.out.println(a);
	}
}
}
