package day22_methodReturnValue;

public class StringUtil {
	
	
	public static String nameInRegularFormat(String name) {
		String str1 = name.toUpperCase();
		String str2 = name.toLowerCase();
		String str3 = str1.charAt(0) + str2.substring(1);
		return str3;
	}
	
	
	
	
	
	
	public static void main(String[] args) {

//		Task14
//		`Write a program that asks user to enter first and 
//		last names, and then prints the full name in regular 
//		format (first character in upper case)
//
//		                input:
//		                    firstName = "tecHCIrcle"
//		                    lastName = "SCHOOL";
//
//		                output:
//		                    Techcircle School
//		`

		String firstName = "tecHCIrcle";
		String lastName = "SCHOOL";
		
		
		
//		String str1 = firstName.toUpperCase();
//		String str2 = firstName.toLowerCase();
//		String str3 = str1.charAt(0) + str2.substring(1);
//		System.out.println(str1 + str2);
//		System.out.println(str3);

		
		String output = nameInRegularFormat(firstName) + " "+ nameInRegularFormat(lastName);
		
		System.out.println(output);
		
		
		System.out.println(nameInRegularFormat("AAAAAAAAAAAAAbbbbbbbbbbbbbbbbbbCCCCCCCCCCCCCc"));
		
		
		
//		String str2 = "";
//		
//		for (int i = firstName.length() -1 ; i >= 0; i--) {
//			str2 += firstName.charAt(i);
//		}
//		
//		System.out.println(str2);
//		
		
		
		System.out.println(reverse("abc"));
		
		
		System.out.println(isPalendrome("abc"));
		
		System.out.println(isPalendrome("civic"));
		
		
		
		
		
		
		
	} // end of main method
	
	
	public static String reverse(String str) {
		String str2 = "";
		
		for (int i = str.length() -1 ; i >= 0; i--) {
			str2 += str.charAt(i);
		}
		
		return str2;
		
	}
	
	
	public static boolean isPalendrome(String str) {
		
		boolean result = reverse(str).equals(str);
		return result;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
