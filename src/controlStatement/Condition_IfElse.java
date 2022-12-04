package controlStatement;



public class Condition_IfElse {
   String myHeroname="batman";
   public void guessTheName() {
	   if(myHeroname.equals("bat man")) {
		   System.out.println("yes you will got correct answer bat man");
	   }
	   else if(myHeroname.equals("super man")) {
		   System.out.println("yes you will got correct ans is super man");
	   }
	   else if(myHeroname.equalsIgnoreCase("ant man")) {
		   System.out.println("yes you will got the correct ans ant man");
	   }
	   else{
		   System.out.println("sorry i cant guess it!!!");
	   }
   }
   public static void main(String[] args) {
	   Condition_IfElse c= new Condition_IfElse();
	   c.guessTheName();
}
	}
	

