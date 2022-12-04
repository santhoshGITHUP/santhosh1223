package abstractionClass;

public  class BWM extends Car{
	@Override
	public void engineSecret() {
		System.out.println("BMW Engine Secret");
	}
	@Override
	public void companyVault() {
		System.out.println("BMW Company vault");
	}
	
	public static void main(String[] args) {
		Car car = new BWM();
		car.engineSecret();
		car.companyVault();
	}
	
}
