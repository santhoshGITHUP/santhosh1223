package scanner;

import java.util.Scanner;

public class Examble3 {
public static void main(String[] args) {
	System.out.println("Enter the deparment.....");
	Scanner s= new Scanner(System.in);
	int sub = s.nextInt();
	
	switch (sub) {
	case 1: {
		System.out.println("machinical depatmen");
		break;
	}
	case 2: {
		System.out.println("civil depatmen");
		break;
	}
	case 3: {
		System.out.println("CSE depatmen");
		break;
	}
	case 4: {
		System.out.println("EEE depatmen");
		break;
	}
	default:
	System.out.println("NOt avable");
	}
	
			
}
}
