package return_Type;

public class Examble1 {
  int collectamout=1000;
  public int collecAmountAndGiveToMe() {
	  System.out.println("daddy have collected ruppes:"+collectamout +" " +"and send to u");
	return collectamout;
  }
  public static void main(String[] args) {
	  Examble1 e= new Examble1();
	int amount = e.collecAmountAndGiveToMe();
	
	System.out.println("got the amount son: "+amount);
	System.out.println("thank you my dear son");
}
}
