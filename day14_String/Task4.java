package day14_String;


public class Task4 {
	public static void main(String[] args) {

		//write a program that can check if the first and last characters of the string are same 
		//ex: level output: same
		
		
		String str = "technology";
		char firstLetter = str.charAt(0);
//		char lastLetter = str.charAt(4);
		char lastLetter = str.charAt(str.length()-1);
		
		if (firstLetter == lastLetter) {
			System.out.println("same");
		}else {
			System.out.println("Not same");
		}
		
		
		
		
		
	}
}
