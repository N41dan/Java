package day27_Ecapsulation;

public class ObjPerson {

	public static void main(String[] args) {
//		5, Create a class called Main that creates two Person objects and sets 
//		   their attributes using the constructor.
		
		Person john = new Person("John Doe", 35 , "123 Main St");
		
		Person jane = new Person("Jane Smith", 28 , "456 Elm St");
		
		
//		6, Print out the details of the two Person objects using the getter methods.
		
		
		System.out.println("Name: "+john.getName());
		System.out.println("Age: "+john.getAge());
		System.out.println("Address: "+ john.getAddress());
		
		
		
		
		System.out.println("Name: "+jane.getName());
		System.out.println("Age: "+jane.getAge());
		System.out.println("Address: "+ jane.getAddress());
		
		
		Person tom = new Person("    ", 350 , "     " );
		
		
		
//		
//		output:
//		
//		Person 1:
//				Name: John Doe
//				Age: 35
//				Address: 123 Main St
//
//		Person 2:
//				Name: Jane Smith
//				Age: 28
//				Address: 456 Elm St

	}

}
