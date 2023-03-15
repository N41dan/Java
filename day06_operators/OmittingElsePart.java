package day06_operators;

public class OmittingElsePart {
	public static void main(String[] args) {
		
//		syntax:
//			if (condition) {
//				true block
//			}
		
		
		int num = 2;
		
		if (num % 2 == 0) {
			System.out.println("Even");
		}
		
		
		if (num % 2 == 1) {
			System.out.println("Odd");
		}
		
		int num2 = 9;
		
//		Write a program to find out the max value between num and num2
		
		
		int max = 0;
//		
//		if (num > num2) {
//			max = num;
//		}else {
//			max = num2;
//		}
		
		if (num > num2) {
			max = num;
		}
		
		if (num < num2) {
			max = num2;
		}
		
		
		System.out.println("Max value is "+ max);
		
		
		
		
//		if (conditionA && conditionB) {
//			true block
//		}
		
		int score = 179;
		
		if (score >= 0 && score <= 100) {
			
			if (score >= 90 && score <= 100) {
				System.out.println("A");
			}
			
			if (score >= 75 && score <= 79) {
				System.out.println("C+");
			}
			
			
		}else {
			System.out.println("invalid score");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
