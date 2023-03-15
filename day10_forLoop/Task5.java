package day10_forLoop;

public class Task5 {

	public static void main(String[] args) {
		/*
	        Print:
	            A~Z
	            a~z
	            Z~A
	            z~a
         */
		
		for(int i = 'A'; i <= 'Z'; i++) {
			char letter = (char)i;
			System.out.println(letter);
		}
		
		System.out.println("------------");
		for(int i = 'a'; i <= 'z'; i++) {
			char letter = (char)i;
			System.out.println(letter);
		}
		
		
		System.out.println("---------------------------");
		for(int i = 'Z'; i >= 'A'; i--) {
			char letter = (char)i;
			System.out.println(letter);
		}
		
		System.out.println("---------------------------");
		for(int i = 'z'; i >= 'a'; i--) {
			char letter = (char)i;
			System.out.println(letter);
		}
		
		
//		print the following shape:
//
//            * * * * * * 
//            * * * * * *
//            * * * * * *
//            * * * * * *
//            * * * * * *
//            * * * * * *
//            * * * * * *
//            * * * * * *
		
		
		for (int i = 1 ; i <= 8 ; i++) {
			System.out.println("* * * * * *");
		}
		
		
//		Write a method which prints out the numbers from 1 to 100 
//		but for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,  
//		for numbers which are a multiple of 3, print "FIN" instead of the number and 
//		for numbers which are a multiple of 5, print "RA" instead of the number. 
//
//        ex: 
//            output:
//                1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN 

	}

}
