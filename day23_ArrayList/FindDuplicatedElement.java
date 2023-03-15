package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicatedElement {
	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<>();

		list.add("Bea");
		list.add("Abdusamat");
		list.add("Trookie");
		list.addAll(Arrays.asList("Trookie", "Maria", "Sharuhan", "Ananas"));
		list.add("Bea");
		list.add("Abdusamat");
		
		System.out.println(list);
		
		
		System.out.println(list.contains("Trookie"));
		
		System.out.println(list.contains("Payz"));
		
		
		
		//[Bea, Abdusamat, Trookie, Trookie, Maria, Sharuhan, Ananas]
		
		
		
//		list2
		
		
		ArrayList<String> list2 = new ArrayList<>();
		
		for (int i = 0 ; i < list.size() ; i++) {
			
			if (!list2.contains(list.get(i))) {
				list2.add(list.get(i));
			}else {
				System.out.println(list.get(i) + " is duplicated");
			}
			
			
		}
		
		
//		Task16
//		Write a program to extract distinct character from a string input: abcabcabcabc output:abc

		String str = "abcabcabcabc";
		
		String distinctChars = "";
		
		for (int i = 0 ; i < str.length() ; i++) {
			if (!distinctChars.contains(Character.toString(str.charAt(i)))) {
				distinctChars += str.charAt(i);
			}
		}
		
		System.out.println(distinctChars);
		
		
		
		
		
		
		
		/*
		Write a program that can verify if a password is a strong password. 
		Characteristics of strong passwords are: 
		1.1 Password must be at least have 8 characters long and should not contain space 
		1.2 PassWord should at least contain one upper case letter 
		1.3 PassWord should at least contain one lower case letter 
		1.4 Password should at least contain one special characters 
		1.5 Password should at least contain a digit
		*/
		
		/*
		Write a Java program that reads in 10 integers from the user and stores them in an ArrayList. 
		Then, output the elements of the ArrayList in reverse order.
		
		
		
		/*
		 * Write a Java program that creates an ArrayList of 20 random integers between 1 and 100. 
		   Then, output the sum of all even numbers in the ArrayList.
		 */
		
		/*
		Write a Java program that reads in a list of names from the user and stores them in an ArrayList. 
		Then, sort the ArrayList in alphabetical order and output the sorted list
		*/
		
		/*Write a Java program that reads in a list of strings from the user and stores them in an ArrayList. 
		 * Then, remove all duplicates from the ArrayList and output the resulting list.
		
		*/
		
		
		/*Write a Java program that reads in a list of numbers from the user and stores them in an ArrayList. Then, 
		 * calculate and output the average of the numbers in the ArrayList.*/
		
		/*
		 * Write a Java program that reads in a list of integers from the user and stores them in an ArrayList. Then, 
		 * remove all negative numbers from the ArrayList and output the resulting list.
		 */
		
		/*
		 * Write a Java program that reads in a list of strings from the user and stores them in an ArrayList. 
		 * Then, output the strings in reverse order, with each string's characters reversed
		 */
		
		
		
		
		
		
		
		
		
		
		
	}
}
