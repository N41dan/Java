package day10_forLoop;

public class ForLoop {
	public static void main(String[] args) {
		
//		Print 1 ~ 10
		
		int count = 1;
		
		while (count <=10){
			System.out.println(count);
			count++;
		}
		
		
		// do while
		
		count = 1;
		
		do {
			System.out.println(count);
			count++;
		}while (count <=10);
		
		
		
//		syntax:
//			for (initialaze variable; condition ; increment or decrement) {
//				your code
//			}
		
		for (int i = 1 ; i <= 10 ; i++ ) {
			System.out.println(i);
		}
		
		
		
		for (int i = 25 ; i < 36 ; i++) {
//			System.out.println(i);
			System.out.println("Hello Java");
		}
		
//		print 10 to 1 using for loop
		
//		if () {}
//		while() {}
		for (int i = 10; i >=1 ; i--) {
			System.out.println(i);
		}
		
		for (int i = 10; i >=1 ; i--) {
			System.out.println(i);
			if (i == 5) {
				break;
			}
		}
		
		
//		Write a program to print the patern below on the console
//		 *****
//		 ****
//		 ***
//		 **
//		 *
		
		
		String str1 = "*";
		String str2 = "**";
		String str3 = "***";
		String str4 = "****";
		String str5 = "*****";
		
		
		System.out.println("----------");
		
		
		for(int i = 1; i <= 5; i++) {
			
			
			switch(i) {
			case 1:
				System.out.println(str5);
				break;
			case 2:
				System.out.println(str4);
				break;
				
			case 3:
				System.out.println(str3);
				break;
				
			case 4:
				System.out.println(str2);
				break;
				
			case 5:
				System.out.println(str1);
				break;
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
