package day27_Ecapsulation;

public class Car {
	// instance variables
	private String make;
	private String model;
	private String color;
	private int year;
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// no argument constructor
	public Car() {
		System.out.println("no args constructor of Car class");
	
	}
	
	//Parameterized constructor 
	public Car(String make) {
		System.out.println("Parameterized constructor of car class with make");
		this.make = make;
	}
	
	//Parameterized constructor 
	public Car(String make , String model) {
		System.out.println("Parameterized constructor of car class with make and model");
		this.make = make;
		this.model = model;
	}
	
	//Parameterized constructor 
	public Car(String make , String model, int year, String color) {
		System.out.println("Parameterized constructor of car class with all the instance variables");
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
	}
	
	
	// instance method
	public String getInfo() {
		String message = "Car class : Make="+make+" , model="+model +" , year="+year+" , color="+color;
		return message;
	}
	
	
	
	
	
	
	
	
}
