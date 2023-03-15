package day26_constructors;

public class Student {
	
	// constructor is a special method to create the object 
	
	//If we do not create any constructor, 
	//the Java compiler automatically create a no-arg constructor
	//during the execution of the program
	
	
	/// instance variables
	String name;
	long id;
	int age;
	char gender;
	
	// instance method
	public void study(String topic) {
		System.out.println(name +" is studying "+ topic);
	}
	
	public void takeExam(String subject) {
		System.out.println(name + " is taking "+subject+" exam");
	}
	
}
