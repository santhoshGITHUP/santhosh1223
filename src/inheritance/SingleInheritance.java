  package inheritance;

public class SingleInheritance {

	public static void main(String[] args) {
		Cat c= new Cat();
		c.eat();
		c.sleep();
		c.drink();
		System.out.println(" dog--------------");
		Dog d= new Dog();
		d.eat();
		d.sleep();
		d.bark();
		
	}
	
}
  class Animal{
	public void eat() {
		System.out.println("food");
	}
	public void sleep() {
		System.out.println("sleep");
	}
}
  class Cat extends Animal{
	  public void drink() {
		  System.out.println("milk");
	  }
  }
 
	  class Dog extends Animal{
		  public void bark() {
			  System.out.println("barking");
		  }
	  }
  
