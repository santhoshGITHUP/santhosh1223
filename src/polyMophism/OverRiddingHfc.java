package polyMophism;

public class OverRiddingHfc extends OverRiddingRbi {
	@Override
	public void age() {
		int age=22;
		System.out.println(age);
	super.age();
	}
 
	public static void main(String[] args) {
		OverRiddingRbi overRiddingRbi= new OverRiddingHfc();
		overRiddingRbi.age();
		overRiddingRbi.name();
		
		
	}
	

 
}
