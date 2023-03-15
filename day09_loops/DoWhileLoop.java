package day09_loops;

public class DoWhileLoop {
	public static void main(String[] args) {
	
		int a = 1;
		
		do {
			System.out.println(a);
			a++;
		}while (a < 10);
		
		
		
		int i = 10;
		
		do {
			System.out.println(i);
			i--;
		}while(i>=1);
		
		
//		print 100 to 50;
		
		i = 100;
		
		do {
			System.out.println(i);
			i--;
			
			if (i == 50) {
				break;
			}
			
		}while(i >= 0);
		
		/// Print all even number between 1 to 100;
		
		System.out.println("----------------------");
		i = 1;
		
		do {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			
			i++;
		}while(i <= 100);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
