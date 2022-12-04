package day.publi.exam;

import com.same.Company;

public class Bubli2 {
public static void main(String[] args) {
	Bubli1 b= new Bubli1();
	b.empId();
	b.trust();
	Bubli2 b1= new Bubli2();
	b1.clintid();
	b1.myName();
	Company c= new Company();
	c.copy();
	
}
 public void clintid() {
	 System.out.println("clinet id 12334456");
 }
 private void myName() {
	 System.out.println("my name is sanhtosh");
 }
}
