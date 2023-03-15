package day15_StringTasks;

public class RemoveCharFromAString {

	public static void main(String[] args) {
		/*
		  How to remove specific characters in the String? 
		  To remove specific characters in the String .For example,
		  
		  
		  If the original string is "Alive is awesome"   
		  and the user inputs string to remove "alwsr"  
		  then it should print  "ive i eome" as output .
		  
		  If the original string is "Learning never stops"  
		   and the user inputs string to remove "estp"  
		   then the it should print   "Larning nvr o" as output .
		  
		  
		 */
		
		String str = "Learning never stops";
//		str = str.replace("a", "");
//		str = str.replace("l", "");
//		str = str.replace("w", "");
//		str = str.replace("s", "");
//		str = str.replace("r", "");
//		System.out.println(str);
		
		String strToRemove = "estp";
		
		for (int i = 0 ; i < strToRemove.length() ; i++) {
			//System.out.println(strToRemove.charAt(i));
			
			str = str.replace(strToRemove.charAt(i), '%' );
		}
		
		System.out.println(str);
		
		str = str.replace("%", "");
		System.out.println(str);
		
		
		
		
		

	}

}
