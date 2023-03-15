package day04_1streview;

public class SwapVariable {

	public static void main(String[] args) {
		int x = 10000;
		int y = -5;
		System.out.print("x : ");
		System.out.println(x); // 1
		System.out.print("y : ");
		System.out.println(y); // 2
		
		// swap value in these two variable
		
		// expected result
		// x : 2
		// y : 1
		int temp = x; // temp = 10, x = 10
		x = y; // x = 20, y = 20
		y = temp; // x = 20, y = 10
		System.out.println(x);
		System.out.println(y);
	}

}
