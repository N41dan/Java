package day09_loops;

public class PrintAToZ {
	public static void main(String[] args) {
		
		/*
		 *  Java Type Casting
			Type casting is when you assign a value of one primitive data type to another type.
			
			In Java, there are two types of casting:
			
			Widening Casting (automatically) - converting a smaller type to a larger type size
			byte -> short -> char -> int -> long -> float -> double
			
			Narrowing Casting (manually) - converting a larger type to a smaller size type
			double -> float -> long -> int -> char -> short -> byte
		 */
		
		
		char letter1 = 'A';
		
		int num = letter1;
		
		System.out.println(num); //65
		
		
		
		char letter2 = 'Z';
		int num2 = letter2;
		
		System.out.println(num2); // 90
		
//		       65  <=  90
		while (num <= num2) {
			char letter3 = (char)num;
			System.out.println(letter3);
			num++;
		}
		
		
		
		
		// Write a program to print lower case 'a' to lower case 'z'
		System.out.println("--------------------");
		int value = 122;
		
		while(value >= 97) {
			
			char letter4 = (char)value;
			System.out.println(letter4);
			value--;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
