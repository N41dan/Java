package day09_loops;

public class WhileLoop {
	public static void main(String[] args) {
		
		int i = 0;
//		
//		if (i < 5) {
//			System.out.println(i);
//		}
		
		
//		while (i < 5) {
//			System.out.println(i);
//			
//			i = 6;
//		}
		
		
		System.out.println("------------------");
		// increment operator
		
		while (i < 5) {
			System.out.println(i);
			++i; // increment operator  => post fix i --> i = i+1;
		}
	
		
//		if (i < 5) {
//			System.out.println(i);
//			i++;
//		}
//		
//		if (i < 5) {
//			System.out.println(i);
//			i++;
//		}
//		
//		if (i < 5) {
//			System.out.println(i);
//			i++;
//		}
//		
//		if (i < 5) {
//			System.out.println(i);
//			i++;
//		}
//		
//		if (i < 5) {
//			System.out.println(i);
//			i++;
//		}
		
		
		
		// Write a program to print number 1 to 10 using while loop
		
		int a = 1 ; 
		
		while (a < 11) {
			System.out.println(a++);
//			a++;
		}
		
		
		// Write a program to print number 10 to 1 using while loop
		
		
		System.out.println(a);
		
		
		a = 10;
		
//		while (a >= 1) {
//			System.out.println(a);
//			a--;
//		}
		
		while (a < 11) {
			System.out.println(a--);
			if (a == 0) {
				break;
			}
//			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
