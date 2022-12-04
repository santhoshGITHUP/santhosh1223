package scanner;

import java.util.Scanner;

public class ScannerExamble {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("enter the name");
	String name = s.nextLine();
	System.out.println("Your name is: "+name);
	System.out.println("Enter the age");
	byte age = s.nextByte();
	System.out.println("Your age is: "+age);
	System.out.println("Enter the EmpID");
	int empId = s.nextInt();
	System.out.println("Your EmpId is: "+empId);
	System.out.println("Enter the salary");
	float salary = s.nextFloat();
	System.out.println("your salary is: "+salary);
	System.out.println("Enter the pervsalary");
	double prefvsalary = s.nextDouble();
	System.out.println("Enter the pervsalary: "+prefvsalary);
	System.out.println("Enter the phone number");
	long phonenumber = s.nextLong();
	System.out.println("Your phone number is: "+phonenumber);
	System.out.println("Enter the pincode");
	short pincode = s.nextShort();
	System.out.println("your pincode is: "+pincode);
	
	
}
}