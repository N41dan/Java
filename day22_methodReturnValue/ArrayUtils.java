package day22_methodReturnValue;

import java.util.Arrays;

public class ArrayUtils {
	public static void main(String[] args) {
		
//		int arr[] = {1,2,3};
//		int arr2[] = {4,5,6,7};
//		
//		int arr3[] = new int[arr.length + arr2.length];
//		
//		System.out.println(arr3.length);
//		
//		int index = 0;
//		
//		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr2));
//		System.out.println(Arrays.toString(arr3));
//		
////		arr3[0] = arr[0];
////		arr3[1] = arr[1];
////		arr3[2] = arr[2];
////		arr3[3] = arr2[0];
////		arr3[4] = arr2[1];
////		arr3[5] = arr2[2];
////		arr3[6] = arr2[3];
//		
//		System.out.println(Arrays.toString(arr3));
//		
//		
//		for (int num : arr) {
////			System.out.println(num);
////			System.out.println(index++);
//			
//			arr3[index] = num;
//			index++;
//		}
//		
//		
//		for (int num : arr2) {
////			System.out.println(num);
////			System.out.println(index++);
//			
//			arr3[index] = num;
//			index++;
//		}
//		
//		
//		System.out.println(Arrays.toString(arr3));
		
		
		
		int arr[] = {1,2,3};
		int arr2[] = {4,5,6,7};
		
		int arr3[] = mergeTwoIntArray(arr, arr2);
		
//		System.out.println(arr3);
		
		
		System.out.println(Arrays.toString(arr3));
		
		for (int a : arr3) {
			System.out.println(a);
		}
		
		
	}
	
	
	public static int[] mergeTwoIntArray(int arr[], int arr2[]) {
		int arr3[] = new int[arr.length + arr2.length];
		int index = 0;
		for (int num : arr) {
			arr3[index] = num;
			index++;
		}
	
		for (int num : arr2) {
			arr3[index] = num;
			index++;
		}
		
		return arr3;
	}
	
	
	
	
	
}	
