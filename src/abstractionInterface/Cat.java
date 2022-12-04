package abstractionInterface;

public class Cat implements InterfaceAnimal,InterfaceTiger {


	 
	public static void main(String[] args) {
		Cat c = new Cat();
		c.animalName();
		c.LifeSpan();
		c.tigerColour();
	}

	@Override
	public void tigerColour() {
		System.out.println("tiger bliue colour");		
	}

	@Override
	public void animalName() {
		System.out.println("animal name is lion" );		
	}

	@Override
	public void LifeSpan() {
		System.out.println("12344 days");		
	}
	

}
