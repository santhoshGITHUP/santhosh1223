package arrayExamble;

import java.util.Scanner;

public class Examble {
	public static void main(String[] args) {
		System.out.println("Enter the Length....");
		Scanner scan = new Scanner(System.in);
		int len= scan.nextInt();
		System.out.println("value");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ar[]=new int[len];
		int total=0;
		for(int i=1;i<ar.length;i+=2) {
			ar[i]=sc.nextInt();
			//total=total+ar[i];
			
			
			
		}
		//System.out.println(total);
		
	for(int i=0;i<ar.length;i++) {
			//System.out.println("Enter the value");
		System.out.println(ar[i]);
		}

	}



}
