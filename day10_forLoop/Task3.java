package day10_forLoop;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
//		int input = 9;
		int input = scan.nextInt();
		// 5 X 1 = 5
		// 5 X 2 = 10;
		
		for (int i = 1; i < 11 ; i++ ) {
//			System.out.println(input);
//			System.out.println(input+ " X ");
//			System.out.println(input+ " X " + i );
//			
			System.out.println(input+ " X " + i +" = "+i*input);
			
		}
		
		
		scan.close();
		
	}
}
