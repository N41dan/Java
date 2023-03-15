package day22_methodReturnValue;

import java.util.Arrays;

public class Task {
	// Create a method that accepts a array of integer and return largest value. 
	// input: {4,1,2,5,0}
	// output: 5
	
	public static void main(String[] args) {
		int arr[] =  {4,1,32,65,0};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(arr[arr.length-1]);
		
		System.out.println(maxValue(arr));
	}
	
	public static int maxValue(int arr[]) {
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
	
	
	
}
