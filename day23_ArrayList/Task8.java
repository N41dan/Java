package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

import day22_methodReturnValue.StringUtil;

public class Task8 {
	/*
	 * Write a Java program that reads in a list of strings from the user and stores them in an ArrayList. 
	 * Then, output the strings in reverse order, with each string's characters reversed
	 */
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();

		list.add("Bea");
		list.add("Abdusamat");
		list.add("Trookie");
		list.addAll(Arrays.asList("Trookie", "Maria", "Sharuhan", "Ananas"));
		
		System.out.println(list);
//		 0      1          2       3        4       5        6
//		[Bea, Abdusamat, Trookie, Trookie, Maria, Sharuhan, Ananas]
		
		for (int i = list.size()-1 ; i >= 0 ; i--) {
			//System.out.println(list.get(i));
			
			list2.add(StringUtil.reverse(list.get(i)));
		}
		
		System.out.println(list2);
		
		
	}
	
	
	
}
