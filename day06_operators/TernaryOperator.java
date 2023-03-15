package day06_operators;

public class TernaryOperator {

	public static void main(String[] args) {
		
		int a , b;
		
		a = 10;
		
//		b = (condition) ? true block : false block;
		
		b = (a == 1) ? 5 : 60;
		
		System.out.println("Value of b is "+b);
		
		b = (a == 10) ? 45 : -45;
		
		System.out.println("Value of b is "+b);
		
		
		// Write a program to find out the given number is odd or even.
		
		int num = 230;
		
		
		String oddOrEven = (num % 2 == 0) ? "Even": "Odd";
		
		
		System.out.println(oddOrEven);
		
		 oddOrEven = (num % 2 == 1) ? "Odd": "Even";
		
		 System.out.println(oddOrEven);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
