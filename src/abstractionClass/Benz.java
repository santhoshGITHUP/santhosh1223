package abstractionClass;

public class Benz extends Car {
	@Override
	public void engineSecret() {
		System.out.println("Benz Engine Secret");
		
	}
	@Override
	public void companyVault() {
		System.out.println("Benz Company vault");
	}
	public static void main(String[] args) {
		Car car= new Benz();
		car.engineSecret();
		car.companyVault();
		
	}

}
