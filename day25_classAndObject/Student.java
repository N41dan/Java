package day25_classAndObject;

public class Student {
	
	// Instance variables
	String name;
	long id;
	char gender;
	int age;
	
	public void code() {
		System.out.println(name +" is coding");
	}
	
	public void study() {
		System.out.println(name +" is watching youtube");
	}
	
	public void submitHomework() {
		System.out.println(name + " is submitting homework using GitHub");
	}
	
	
	public void getInfo() {
		System.out.println("name:"+name + " , id:"+ id + " , gender:"+gender +" , age:"+age);
	}
	
	
}
