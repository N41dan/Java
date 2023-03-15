package day07_controlFlowStatement;

public class GreetingMessage {
	public static void main(String[] args) {

		String greeting = "";
		System.out.println(greeting);
		int hours = 17;

		if (hours >= 5 && hours < 12) {
			greeting = "Good Morning";
		} else if (hours >= 12 && hours <= 17) {
			greeting = "Good Afternoon";
		} else if (hours >= 17 && hours <= 24) {
			greeting = "Good Evening";
		}
		System.out.println(greeting);
System.out.println("-------------------------");

		int age = 9;
		if (age >= 1 && age <= 2) {
			System.out.println("Infancy");
		} else if (age >= 2 && age <= 4) {
			System.out.println("Todler");
		} else if (age >= 5 && age <= 7) {
			System.out.println("Early School Age");
		} else if (age >= 8 && age <= 12) {
			System.out.println("Middle School Age");
		} else if (age >= 13 && age <= 17) {
			System.out.println("Later school age");
		} else if (age >= 18 && age <= 25) {
			System.out.println("Later adolescence");
		} else if (age >= 25 && age <= 30) {
			System.out.println("Early adulthood");
		} else if (age >= 30 && age <= 50) {
			System.out.println("Middle adulthood");
		} else if (age >= 50) {
			System.out.println("Later adulthood");
		} else {
			System.out.println("Invalid age");

		}
		

	}
}
