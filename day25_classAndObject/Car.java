package day25_classAndObject;

public class Car {
	
	//Class − A class can be defined as a template/blueprint that describes 
	//the behavior/state that the object of its type support.
	
	// instance variable  --> variable that declared inside of the class and outside of the method.
	String color;
	String model;
	String brand;
	double price;
	int year;
	
	// instance method
	public void drive() {
		System.out.println("Driving "+ year + " "+ brand + " "+ model);
	}
	
	
	public void stop() {
		System.out.println(year + " "+ brand + " "+ model +"  has stopped");
	}
	
	public void start() {
		System.out.println(year + " "+ brand + " "+ model +"  has started");
	}
	
	
	
}
