package dataType_Basic;

public class DataType {
 private void sambleDetails() {
	 byte age=127;
	 short id=32767;
	 int empId=12345564;
	 long phone= 99654655456l;
	 float salary=6568.64556f;
	 double preSalary=3334.878679;
	 char Gender='M';
	 String name="Santhosh";
	 Boolean materialStatus=false;
	 System.out.println("my id is:"+id+"\n"+
	 "age is"+age+"\n"+"my employee ID is:"+ empId+"\n"+
			 "my phone number:" + phone+"\n"+"salary:"+ salary+"\n"+"pre salary:"+ preSalary+"\n"+
	 "gender is:"+ Gender+"\n"+"my name is:"+ name+"\n"+"my material status:"+ materialStatus);
	 
	 
	 
	 
 }
 public static void main(String[] args) {
	 DataType d= new DataType();
	 d.sambleDetails();
}
}
