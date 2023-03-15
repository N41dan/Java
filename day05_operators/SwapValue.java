package day05_operators;

public class SwapValue {
	public static void main(String[] args) {

		int a = 5;
		int

		b = 10;

		// b = 5;
		// a = 10;

		// swap value using temp variable
		int temp = a; // 5
		a = b; // 10
		b = temp;

		System.out.println(a);
		System.out.println(b);

		// swap without using temp variable

		int A = 30;
		int B = 50;

		A = A + B; // 80
		B = A - B; // 80 - 50
		A = A - B;

		System.out.println(A);
		System.out.println(B);

	}
}
