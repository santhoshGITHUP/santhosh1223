package collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExamle {
  public static void main(String[] args) {
	Set<Integer> li= new TreeSet<Integer>();
	li.add(44);
	li.add(33);
	li.add(66);
	li.add(55);
	li.add(100);
	li.add(100);

	System.out.println(li);
	Set<Integer> li2= new TreeSet<Integer>();
	li2.add(10000);
	li2.addAll(li);
li.remove(44);
	//System.out.println(li2);
	
	
}
}
