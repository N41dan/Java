package day05_operators;

import java.util.Scanner;

public class Task3 {
	/*Task 3
	Write a Java program that prompts the user to enter three integer values. 
	The program should then compare each pair of values using the relational operators 
	and print the results to the console. 
	For example, if the user enters the values 10, 20, and 30, the program should output:
	10 < 20: true
	10 < 30: true
	20 < 30: true
	*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter x...");
        int x = scan.nextInt();
        System.out.println("Enter y...");
        int y = scan.nextInt();
        System.out.println("Enter z...");
        int z = scan.nextInt();
        scan.close();
        
        System.out.println(x + " "+ y + " "+z);
        
		//10 < 20: true
        boolean result1 = x < y;
        System.out.println(x < y);
        System.out.println("x < y "+result1);
        System.out.println(x+" < "+y+"  "+result1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}
	
	
	
}
