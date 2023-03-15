package day07_controlFlowStatement;

public class IfStatementReview {
	public static void main(String[] args) {
		
		// if (booleanCondition){
			// if condition is true, this block of code will be run
		//}else{
			// else part is optional. it will executed when the condition is false
		//}
		
		int num = 122;
		int num2 = 22;
		int maxValue = 0;
		
		if (num > num2) {
			maxValue = num;
		}else {
			maxValue = num2;
		}
		
		System.out.println(maxValue);
		
		
		int num3 = 322; 
		//int num4 = 10;
		
		if (num3 > num2 && num3> num) {
			maxValue = num3;
		}
		
		if (num2 > num3 && num2> num) {
			maxValue = num2;
		}
		
		if (num > num3 && num> num2) {
			maxValue = num;
		}
		
		
		System.out.println(maxValue);
		
		
		int a = 3;
		int b = 2;
		int c = -9;
		
		if (a > b && !(c > a) ) {
			System.out.println(a);
		}
		
		
		
		int count = 0;
		
		
		if (a > b ) {
			System.out.println(a);
			count ++;
		}
		
		System.out.println(count);
		
		
		int A = 1;
		int B = 2;
		int C = 3;
		int D = 4;
		int E = 5;
		
		int evenNumCount = 0;
		int oddNumCount = 0;
		
		if (A % 2 == 0 ) {
			evenNumCount++;
		}else {
			oddNumCount++;
		}
		
		if (B % 2 == 0 ) {
			evenNumCount++;
		}else {
			oddNumCount++;
		}
		
		if (C % 2 == 0 ) {
			evenNumCount++;
		}else {
			oddNumCount++;
		}
		
		if (D % 2 == 0 ) {
			evenNumCount++;
		}else {
			oddNumCount++;
		}
		
		if (E % 2 == 0 ) {
			evenNumCount++;
		}else {
			oddNumCount++;
		}
		System.out.println("------------");
		System.out.println("evenNumCount "+evenNumCount); 
		System.out.println("oddNumCount "+oddNumCount);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
