package home.workout.programs;

public class PhoneInfo {
  public static void main(String[] args) {
	  PhoneInfo p = new PhoneInfo();
	  p.phoneNumber();
	  p.imiNumber();
	  p.camer();
	  p.storage();
	  p.osName();
	  
	  
	    int name=30;
	    System.out.println("value of string"+String.valueOf(name));
	
}
  private void phoneNumber() {
	  System.out.println("phone numer:9942978431");
  }
  private void imiNumber() {
	  System.out.println("IMI number:9090898767");
  }
  private void camer() {
	  System.out.println("64 megapic camera capacity");
	 
  }
  private void storage() {
	  System.out.println("storage 128 GB");
  }
  private void osName() {
	  System.out.println("Android v9.0(pie)");
  }
  
}
