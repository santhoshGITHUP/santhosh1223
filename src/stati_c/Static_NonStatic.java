package stati_c;

public class Static_NonStatic {
	   static String schoolname;
	public static void method1() {
		System.out.println("static methods...");
	}
//	public  void nonStatic() {
//		
//		System.out.println("Non Static");
//		method1();    // we can call non static methods but cant do call the static method
//	}
	
	
	
public static void main(String[] args) {
	method1();
	

	
	//Static_NonStatic s = new Static_NonStatic();
	//s.nonStatic();
	
}
}
