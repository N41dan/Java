package day10_forLoop;

public class Homework11 {
	public static void main(String[] args) {
		
//		Tas11:
//			Write a Java program to convert seconds to hour, minute and seconds. Go to the editor
//			Sample Output:
//			Input seconds: 86399
//			Result: 23:59:59
		
		int input = 86399;
		
		int hour = input / 3600; // 60 * 60
		System.out.println(hour);
		
		int minute = (input % 3600)%60 ;
		
		int second = ((input % 3600)%60) %60;
		
		
		System.out.println(minute);
		System.out.println(second);
		
		
		System.out.println(hour * 3600);
		System.out.println(input - hour * 3600);
		
		int minute2 = (input - hour * 3600)/60;
		
		System.out.println((input - hour * 3600)/60);
		
		System.out.println(minute2); // 59
		
		int second2 =(input - hour * 3600) - (minute2 * 60);
		System.out.println(second2);
		
		
		
		
		System.out.println(input%3600); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
