package home.workout.programs;

public class Employeedetails {

	private void empId() {
		System.out.println(" employee ID is:CTSP006");
	}
	private void empName() {
		System.out.println("employee name is :santhosh");
	}
	private void embDob() {
		System.out.println("employee DOB:20/06/1997");
	}
	private void empPhone() {
		System.out.println("employee phone number: 9942978431");
	}
	private void empMail() {
		System.out.println("employee Mail Id:Pvsanthoshsandy@gamil.com");
	}

	private void empAddress() {
		System.out.println("1/4 malar street");
		System.out.println("TK nagar");
		System.out.println("chennai");
	}
	public static void main(String[] args) {
		Employeedetails em= new Employeedetails();
		em.empId();
		em.empName();
		em.embDob();
		em.empPhone();
		em.empMail();
		em.empAddress();
	}
}
