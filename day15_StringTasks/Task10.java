package day15_StringTasks;

public class Task10 {
	public static void main(String[] args) {
		/*
		Task10
		ask the user to enter a word. 
		if the word ends with "ly", print "really???" , 
		 otherwise, print "never mind"
		 */
		
		String str = "really";
		
		String str2 = str.substring(str.length()-2);
		
		System.out.println(str2);
		
		
		if (str2.equals("ly")) {
			System.out.println("really??");
		}else {
			System.out.println("never mind");
		}
		
		
		System.out.println(str.startsWith("re"));
		System.out.println(str.endsWith("ly"));
		
		
		if (str2.endsWith("ly")) {
			System.out.println("really??");
		}else {
			System.out.println("never mind");
		}
		
		
		
	}
}
