package day15_StringTasks;

public class Task9 {
	public static void main(String[] args) {
		
		//Task9
//		Ask user to enter two words. 
//		Print first word without its first character then print the second word without its first character.
//		 Input: apple banana Output: ppleanana
		
		
		String firstWord = "apple";
        String secondWord = "Bannana";
        
        
        String str = firstWord.substring(1) + secondWord.substring(1);

//        System.out.print(firstWord.substring(1));
//        System.out.println(secondWord.substring(1));
		System.out.println(str);
		
		
		
	}
}
