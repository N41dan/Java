package day22_methodReturnValue;

public class ArrayHomework_Task3 {
	public static void main(String[] args) {
		
//		Task3
//		Write a program that can count how many palindromes in an array of string
//
//		Example:
//
//		input:
//		{"anna", "level", "Java"}; 
//
//		output:
//		2
		
		String arr[]  = {"anna", "level", "Java"}; 
		
		int count = 0;
		
		for (String s : arr) {
			if (StringUtil.isPalendrome(s)) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	
	
}
