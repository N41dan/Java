package day22_methodReturnValue;

public class TestCalculator {
	public static void main(String[] args) {

		int a = 0;
		int b = 5;
		int c = 3;

		int result = Calculator.addition(a, b); // 5
		double result2 = Calculator.divison(b, c); //

		System.out.println(result + result2);

		int result3 = Calculator.subtraction(b, c) + Calculator.multiplication(a, b);

		System.out.println(result3);

	}
}
