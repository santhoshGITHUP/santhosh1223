package polyMophism;

public class OverLoadingEabmle {

	// arugument based on data type

		private void employeeDetails() {
System.out.println("employee details");
		}
		// arugument based on dataa variale
		private void employeeDetails(String name) {
			System.out.println("Employee name is: "+name);
		}
		
	//class Employeedata{
		private void employeeDetails(int age) {
			 System.out.println(" age: "+age);
		}
		private void employeeDetails(long phone) {
			System.out.println("phone number: "+phone);
		}
		// argument based on count
		
		private void employeeDetails(String name,int age) {
		System.out.println("name is: "+name+"\n"+"age is: "+age);
	}
		private void employeeDetails(String name,int age,long phone) {
			System.out.println("name: "+name+"\n"+"age: "+age+"\n"+"phone number: "+phone );
			
		}
	
		private void employeeDetails(int age,long phone,String name) {
			System.out.println("age: "+age+"\n"+"phone number: "+phone+"\n"+"name: "+name);
			
		}		
		


	public static void main(String[] args) {
		
		
		OverLoadingEabmle e= new OverLoadingEabmle();
		
	e.employeeDetails();
	e.employeeDetails(28);
	e.employeeDetails(9933444444l);
	e.employeeDetails("santhosh");
	e.employeeDetails("santhish",30);
	e.employeeDetails(28, 3333333222222l, "bala");
	e.employeeDetails("guru", 44, 444444444444l);
	
		
	} 
	 
	 
	 
	 
	 
	 
	 
	 
}