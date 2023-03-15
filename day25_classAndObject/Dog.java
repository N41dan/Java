package day25_classAndObject;

public class Dog {
	
//	Update Dog class by creating couple of constructors 
//	and create 4 dog object
//	
	// instance Variables
	String breed;
	String name;
	int age;
	String size;
	String color;
	
	
	public void eat() {
		System.out.println(name + " is eating ");
	}
	
	
	public void sit() {
		System.out.println(name + " is sitting ");
	}
	
	public void bark() {
		System.out.println(name + " is barking ");
	}
	
	public void play() {
		System.out.println(name + " is playing ");
	}
	
	public void wagTail() {
		System.out.println(name + " is wagging its tails");
	}
	
	public void introduce() {
		System.out.println("Hi  wooff wwoof");
		System.out.println("My name is "+ name+".");
		System.out.println("I'm am a "+ breed+" I'm "+age +" years old");
	}
	 
	
	
	
	
	
	
	
	
	
	
	
}
