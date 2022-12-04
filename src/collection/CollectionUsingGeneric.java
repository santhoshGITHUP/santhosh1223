package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionUsingGeneric {
	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("santhosh");
		list.add("muthu");
		list.add("Sundhar");
		list.add("kavi");
		list.add("mano");
		List<String> list2= new LinkedList<String>();
		list2.add("arun");
		list2.add("mani");
		System.out.println(list);
		System.out.println(list.size());

		for(int i=0;i<list.size();i++) {

			System.out.println(list.get(i));
		}
		boolean empty = list2.isEmpty();   // to check the list is empty or not
		System.out.println(empty);
		boolean addAll = list2.addAll(list);   // add list value on list2 array
		System.out.println(list2);
		System.out.println(addAll);


	}
}
