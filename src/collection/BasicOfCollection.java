package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BasicOfCollection {
public static void main(String[] args) {
List li  = new ArrayList();
	
li.add(1000);
li.add("santhosh");
li.add(200);
li.add(300);
li.add("siva");
li.add(11000);

List li2= new LinkedList();
li2.add("muthiu");
li2.add(101010);
li2.add("santhosh");
	System.out.println(li);
	  for(int i=0;i<li.size();i++) {
		  System.out.println(li.get(i));
	  }
	//  li.addAll(li2);
	 // li.remove(li2);
	  li.retainAll(li2);  /// to  commnon value displayed 
	  
	 
	  System.out.println("using for Each condition");
	  for(Object a:li) {
		  System.out.println(a);
	  }
}	
}
