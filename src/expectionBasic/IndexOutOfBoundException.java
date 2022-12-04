package expectionBasic;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBoundException {
public static void main(String[] args) {
	List li= new ArrayList();
	li.add(12);
	li.add("santhosh");
	Object object = li.get(1);
	System.out.println(object);
	System.out.println(li.get(2));
}
}
