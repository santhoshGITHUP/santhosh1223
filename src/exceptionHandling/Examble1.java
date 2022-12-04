package exceptionHandling;

public class Examble1 {
 public static void main(String[] args) {
	
	 try {
		 int number1=2;
		 int number2=0;
		 int result=number1/number2;
		 System.out.println(result);
	 }
	 
	 catch(ArithmeticException e){
		 System.err.println("Dont divied by zero, this is Arithmatic exception");
	 }
	 catch(NullPointerException e)
	 {
		 System.err.println("this is null pointer exception");
	 }
	 catch(Exception e) {
		 System.out.println("Exception completed");
}
}
}