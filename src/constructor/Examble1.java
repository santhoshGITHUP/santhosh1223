package constructor;

public class Examble1 {
   String emp_name;
   int emp_id;
   
	Examble1(String name,int id){
		emp_name=name;
		emp_id= id;	
	}
	private void employeeDetails() {
		System.out.println(" Employee name is: "+emp_name+" "+"Employee id is: "+emp_id );

	}
	 public static void main(String[] args) {
		 Examble1 e= new Examble1("santhosh", 123);
		 e.employeeDetails();
		 Examble1 e1 = new Examble1("sanjai", 28);
		 e1.employeeDetails();
		 
	}
	
}

