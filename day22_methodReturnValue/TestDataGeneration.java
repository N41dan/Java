package day22_methodReturnValue;

import java.util.Random;

public class TestDataGeneration {
	public static void main(String[] args) {
		
//		for (int i = 0 ; i < 100 ; i++) {
//			System.out.println(randomPhoneNumber ());
//		}
		
		
//		                      0         1        2        3          4          5
		String domains[] = {"Oracle","Amazon","Github","Walmart","Costco","techcircle"};
		
//		System.out.println(domains[0]);
//		
		Random random = new Random();
//		int index = random.nextInt(domains.length);
//		System.out.println(index);
//		
//		System.out.println(domains[index]);
		
//		for (int i = 0 ; i < 100 ; i++) {
//			System.out.println(getRandomValueFromAnArray(domains));
//		}
		
		
//		email  test@domain.com
		
		String userName = "john"+random.nextInt(10000000);
		System.out.println(userName);
		
		String email = userName+"@"+getRandomValueFromAnArray(domains) +".com";
		
		System.out.println(email);
		
		
		for (int i = 0 ; i < 100 ; i++) {
			System.out.println(getRandomEmail());
		}
		
		
		
		
		
		
	}
	
	public static String getRandomEmail() {
		Random random = new Random();
		String domains[] = {"Oracle","Amazon","Github","Walmart","Costco","techcircle"};
		String userName = "john"+random.nextInt(10000000);
		//System.out.println(userName);
		String email = userName+"@"+getRandomValueFromAnArray(domains) +".com";
//		System.out.println(email);
		return email;
		
	}
	
	
	
	public static String getRandomValueFromAnArray(String arr[]) {
		Random random = new Random();
		int index = random.nextInt(arr.length);
		return arr[index];
	}
	
	
	
	
	
	public static String randomPhoneNumber () {
		String phoneNumber = "";
		Random random = new Random();
		int num = random.nextInt(999);
		//System.out.println(num);
		int num2 = random.nextInt(999);
		//System.out.println(num2);
		int num3 = random.nextInt(9999);
		//System.out.println(num3);
		phoneNumber = ""+num + num2 + num3;
		
		//System.out.println(phoneNumber);
		return phoneNumber;
	}
	
	
	
	
	
}
