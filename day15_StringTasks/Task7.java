package day15_StringTasks;

public class Task7 {

	public static void main(String[] args) {
		/*
		Task7
		Write a method that asks user to enter a string. 
		if the string is empty, print: string is empty 
		if the string has more than 3 characters, print the last three characters 
		if the string has less than or equal 3 characters, print the string itself

		input : ""
		output: string is empty

		input : "Pizza"
		output: zza

		input : "car"
		output: car
		*/
//		              01234567
		String str = "13";
	
		
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		
		if (str.isEmpty()) {
			System.out.println("String is empty");
		}else if (str.length() > 3) {
			System.out.println(str.substring(str.length()-3));
		}else {
			System.out.println(str);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
