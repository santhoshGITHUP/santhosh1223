package polyMophism2;

public class TheyWayWetake {

	public void talk(Parents StyleOfTaking) {
		System.out.println("talk with polite and respectfull...");
	}
	public void talk(Partner StyleOfTaking) {
	System.out.println("talk with love and romantic...");
	}
	public void talk(Boss StyleOfTaking) {
		System.out.println("talk with nothing personal");
	}
	
	public void talk(MyChild StyleOfTaking) {
		System.out.println("talk with love and carring");
	}
	
	public static void main(String[] args) {
		TheyWayWetake t= new TheyWayWetake();
		Parents parents = new Parents();
		t.talk(parents);
		Partner partner = new Partner();
	   t.talk(partner);
	   Boss boss =new Boss();
	   t.talk(boss);
	   MyChild child = new MyChild();
	   t.talk(child);
	   
	}
	
}
