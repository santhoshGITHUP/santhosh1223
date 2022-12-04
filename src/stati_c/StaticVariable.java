package stati_c;

public class StaticVariable {
  public static int accountBalance=0;
  String depositedBy;
  public static void main(String[] args) {
	  StaticVariable object1= new StaticVariable();
	  object1.accountBalance=1000;
	  object1.depositedBy="santhosh";
	  StaticVariable object2 = new StaticVariable();   
	  object2.accountBalance=2000;
	  object2.depositedBy="sanjai";
	  System.out.println("object 1: "+object1.accountBalance);
	  System.out.println("object 1:"+object1.depositedBy);
	  System.out.println("object 2: "+object2.accountBalance);
	  System.out.println("object 2:"+object2.depositedBy);
	  
	  
	  
	  
	  
}
}
