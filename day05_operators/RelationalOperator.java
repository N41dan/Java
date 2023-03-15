package day05_operators;

import java.util.Scanner;

public class RelationalOperator {
	public static void main(String[] args) {
		
		int a = 10 ; 
		int b = 20 ; 
		int c = b - a;
		
		// == , > , < , >= , <= , !=
		System.out.println(a == b);
		System.out.println(a == c);
		
		boolean result = a == b;
		
		System.out.println("a == b " + result);
		System.out.println(a == c);
		
		System.out.println(a  > b );
		System.out.println(a < b);
		
		System.out.println(a != b);
		
		System.out.println(a >= c); 
		System.out.println(a <= c); 
		
		//Task1
	
		//Write a Java program that declares two integer variables x and y 
		//and sets their values to 10 and 20, respectively. 
		//Then, use the relational operators ==, !=, >, <, >=, and <= to compare
		//the values of x and y and print the results of these comparisons to the console.
		
		System.out.println("--------------------");
		
	        int x = 10;
	        int y = 20;
	        
	        System.out.println(x == y);
	        System.out.println(x != y);
	        System.out.println(x > y);
	        System.out.println(x < y);
	        System.out.println(x <= y);
	        System.out.println(x >= y);
		
		
		
	       // Task 2
	       // Modify the program from Task 1 so that it prompts the user to enter the values of x and y.
	        //The program should then compare the entered values using the relational operators
	        //and print the results to the console.
		
		
		
		
		
			System.out.println("--------------------");
			
			Scanner scan = new Scanner(System.in);
			
			
			System.out.println("Enter value x :");
	         x = scan.nextInt();
	     	System.out.println("Enter value y :");
	         y = scan.nextInt();
	        
	        System.out.println(x == y);
	        System.out.println(x != y);
	        System.out.println(x > y);
	        System.out.println(x < y);
	        System.out.println(x <= y);
	        System.out.println(x >= y);
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
