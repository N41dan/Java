package day07_controlFlowStatement;

public class Task1 {
	public static void main(String[] args) {
		/*
		 * Write a Java Program to Find the largest value between the 3 numbers below .
		 * n1 = -1.0 n2 = 4.5 n3 = -5.3
		 */

		double n1 = 21.0, n2 = 4.5, n3 = 5.3, maxValue = 0;
		
		//double maxValue = 0;
		
		if (n1 > n2) {
			if (n1 > n3) {
				maxValue = n1;
			}else {
				maxValue = n3;
			}
			
		}else {
			if (n2 > n3) {
				maxValue = n2;
			}else {
				maxValue = n3;
			}
		}
		
		if (n1 > n2 && n1 > n3) {
			maxValue = n1;
		} else if (n2 > n1 && n2 > n3) {
			maxValue = n2;
		}else {
			maxValue = n3;
		}
		
		
//	      if (num3 > num2 && num3 > num1) {
//	            maxValue = num3;
//	        }
//	        
//	        if (num2 > num3 && num2 > num1) {
//	            maxValue = num2;
//	        }
//	        
//	        if (num1 > num3 && num1 > num2) {
//	            maxValue = num1;
//	        }
		
		
		System.out.println(maxValue);
		
		

	}
}
