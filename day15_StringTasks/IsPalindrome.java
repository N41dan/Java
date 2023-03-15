package day15_StringTasks;

public class IsPalindrome {

	public static void main(String[] args) {
		// Write a java program to find out if the string is palindrome.
		
//		input : civic 
//		 output true
//		
//		 input : apple
//		 output: false
	 
//		 input : hannah
//		 output: true
//		                01234
		String input = "civic";
		String reverse = "";
		//Reverse the string 
		
		for (int i = input.length() -1 ;  i >= 0 ; i--) {
			reverse += input.charAt(i);
		}
		
		System.out.println(input);
		System.out.println(reverse);
		
		
		// compare it with the original string
		
		
		if (input.equals(reverse)) {
			System.out.println(input +" is palindrome");
		}else {
			System.out.println(input +" is not palindrome");

		}
		
		

		
		
		 
		

	}

}
