package arrayExamble;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayString {
public static void main(String[] args) {
	System.out.println("enter the name");
//	Scanner sc = new Scanner(System.in);
//	String next = sc.next();
//	String [] st= {"santhosh","siva","sandy"};
//	for(int i=0;i<3;i++) {
//		st[i]=sc.next();
//		System.out.println(st[i]);
//	}
	/////=======higher value===============
	int age[]= {10,20,40,100};
	int Senoioragee=age[0];
	for(int i=0;i<age.length;i++) {
		if(age[i]>Senoioragee) {
			Senoioragee=age[i];
		
		}
		System.out.println(age[i]);
	}
	System.out.println(Senoioragee);
	
}
}
