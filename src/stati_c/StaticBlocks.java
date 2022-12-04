package stati_c;

public class StaticBlocks {

	static {

		System.out.println("Static block 1"); // we can use the mulitible static block and executed from the given order
	}
	
	static {
		System.out.println("static block 2");
	}
	
	public static void main(String[] args) {
		System.out.println("main methods executed");
	}
}
