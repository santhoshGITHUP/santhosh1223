package abstractionInterface;

public class InterfaceCat implements InterfaceAnimal,InterfaceTiger {
	
	@Override
	public void animalName() {
		
		System.out.println(" animal name is cat");
	}
     @Override
	public void LifeSpan() {
System.out.println("100 days");		
	}
	@Override
	public void tigerColour() {
System.out.println("blue colour");		
	}
	
	public static void main(String[] args) {
		InterfaceCat in= new InterfaceCat();
		in.animalName();
		in.LifeSpan();
		in.tigerColour();
	}
	
	
}
