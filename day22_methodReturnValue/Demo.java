package day22_methodReturnValue;

public class Demo {
	public static void main(String[] args) {

		String str = "TechCircle";

		System.out.println(str.length());

		int numberOfChar = str.length();

		System.out.println(numberOfChar);

		boolean value = str.isEmpty();
		System.out.println(value);

		char letter = str.charAt(0);
		
		String str2 = str.substring(4);
		
		
		//String str3 = myMethod();
		
		//sayHello("John");
		System.out.println(sayHello("John"));
		
		String str4 = sayHello("John");
		
		System.out.println(str4);
		
		
		
		
		
		
	}

	public static void myMethod() {
		System.out.println("From my method");
	}
	
	public static String sayHello(String name) {
		return "Hello "+name;
	}
	
	
	
	
}
	
	
	
	
