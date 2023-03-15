package day10_forLoop;

public class Task2 {
	public static void main(String[] args) {
		
		//System.out.println(1+2+3+4+5);
		
		int sum = 0;
		
		for (int i = 1 ; i < 101; i++) {
			//System.out.println(i);
			//sum = sum + i;
			sum +=i;
		}
		
		System.out.println(sum);
		
	}
}
