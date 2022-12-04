package home.workout.programs;

public class ReturnType {
	Integer amountCollect=1000;
	String name="santhosh";
	
	 public Integer collectAmount() {
		 System.out.println("Collect the amout "+amountCollect);
		return amountCollect;
		
	 }
	public String nameIs() {
		return name;
		
	}
	
public static void main(String[] args) {

	ReturnType returnType= new ReturnType();
	Integer collectAmount = returnType.collectAmount();
System.out.println("i will got the amount "+collectAmount);
          String nameIs = returnType.nameIs();
          System.out.println(" collected by "+nameIs);


}

}
