package home.workout.programs;

public class TransportInformation {

	public static void main(String[] args) {
		TransportInformation t= new TransportInformation();
		t.road();
		t.bike();
		t.cycle();
		t.car();
		t.air();
		t.aeroPlane();
		t.heliCoptor();
		t.water();
		t.boat();
		t.ship();
	}
	
	private void transport() {
		System.out.println("transportFram");
	}
	private void road() {
		System.out.println("using Raod Transport.....");
	}
	private void bike() {
		System.out.println("bike");
	}
	private void cycle(){
		System.out.println("cycle");
	}
	private void car() {
		System.out.println("car");
	}
	private void air() {
		System.out.println("using Air transport..... ");
	}	
	private void aeroPlane() {
		System.out.println("AeroPlane");
	}
	private void heliCoptor() {
		System.out.println("helicoptor");
	}
	private void water() {
		System.out.println("using water transport.......");
	}
	private void boat() {
		System.out.println("boat");
	}
	private void ship() {
		System.out.println("ship ");
	}
}
