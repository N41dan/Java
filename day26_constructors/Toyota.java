package day26_constructors;

public class Toyota {
	
	String make;
	String model;
	int year;
	double enginSize;
	String color;
	
	// No argument constructor
	 /*
	  * it has same name as your class name
	  * it has no return type
	  * */
	
	
	public Toyota() {
		System.out.println("Calling no argument constructor of Toyota class");
		make = "Toyota";
	}
	
	
	
//	instance method
	public void start() {
		System.out.println(year + " " + make +" "+ model +" has started" );
	}
	
	
	public void stop() {
		System.out.println(year + " " + make +" "+ model +" has stopped" );
	}
	
	public void drive() {
		System.out.println("Driving "+year + " " + make +" "+ model );
	}
	
}
