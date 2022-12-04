package controlStatement;

public class SwitchCase {
    String heroName="bat man";
	
	public void heroorNot() {
		switch (heroName) {
		case "captan america": {
			System.out.println("captan america is a hero");
	  break;
		}
		case "bat man": {
			System.out.println("bat man america is a hero");
			break;
		}
		case "super man": {
			System.out.println("superman america is a hero");
			break;
		}
		case "ant man": {
			System.out.println("ant man america is a hero");
			break;
		}
		default:
			System.out.println("not match on "+heroName);
		}
	}
	public static void main(String[] args) {
		SwitchCase s= new SwitchCase();
		s.heroorNot();
	}
}
