package constructor;

public class NoArgumentConstructor {
	
	String name;
	int age;
	               
	NoArgumentConstructor(){
		String name="santhosh";
		int age= 24;
		System.out.println("name is: "+name+" age is:"+age);
		System.out.println("constructor has been created");
	}
	
	
public static void main(String[] args) {
	NoArgumentConstructor n= new NoArgumentConstructor();
	
	
	
}
}
