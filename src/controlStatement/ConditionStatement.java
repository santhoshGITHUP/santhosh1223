package controlStatement;

import java.util.Scanner;

public class ConditionStatement {
  public static void main(String[] args) {
	  
	  
	  //  if and if else condition
	    
	  
	  System.out.println("enter the age....");
	  Scanner scan= new Scanner(System.in);
	  int age=scan.nextInt();
	//int age=17;
//	if(age>=18) {
//		System.out.println(" eliageble for voting");
//	}
//	else {
//		System.out.println("Not eligeable for votig");
//	}
	  
	  
	  
	  //nested if else condition
	  
	  
	  if(age>60) {
		  System.out.println("ticket fees is:300" );
	  }
	  else if(age<70) {
		  System.out.println("ticket fees is:400");
	  }
	  else if(age<90) {
		  System.out.println("ticket fees is:500");
	  }
	  else {
		  System.out.println("not allowed...");
	  }
	  
	  
}
}
