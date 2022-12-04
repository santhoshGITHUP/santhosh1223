package scanner;

import java.util.Scanner;

public class Exabmle2 {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	
	
	System.out.println("Enter the first number");
	int num1= s.nextInt();
	System.out.println("enter the second number");
	int num2=s.nextInt();
	int sum=0;
	sum=num1+num2;
	System.out.println("given the add 2 number is :"+sum);
	
	
	
}
}
