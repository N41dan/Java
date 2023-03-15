package day11_nestedForLoop;

public class PrintPatern {
	public static void main(String[] args) {
//		Write a program to print the patern below on the console
		//Task1
//		 *****
//		 ****
//		 ***
//		 **
//		 *
		
		for (int row = 4 ; row >= 0 ; row--) {
			
			for (int starCount = row ; starCount >= 0 ; starCount--) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		
		
		
		//Task2

//	    * 2 3 4 5
//	    1 * 3 4 5
//	    1 2 * 4 5
//	    1 2 3 * 5
//	    1 2 3 4 *
		
		for (int row  = 1 ; row <= 5 ; row++) {
			for (int column = 1 ; column <= 5 ; column++) {
				if (row == column) {
					System.out.print("* ");
				}else {
					System.out.print(column +" ");
				}
				
			}
			System.out.println();
		}
		

		
		
//		Task3
//		Write a program that generates the following pattern using nested for loops:
//
//			   ```
//			   1
//			   22
//			   333
//			   4444
//			   55555
//			   ```
		
		for(int i = 1; i <= 5; i++) {
			
			for (int j = i-1  ; j >= 0; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
