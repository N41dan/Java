package day07_controlFlowStatement;

public class AgeGroup {
	public static void main(String[] args) {

		int age = -923;

		if (age >= 1 && age <= 2) {
			System.out.println("Infancy");
		} else if (age >= 3 && age <= 4) {
			System.out.println("Toddler");
		} else if (age >= 5 && age <= 7) {
			System.out.println("Early School age");
		} else if (age >= 8 && age <= 12) {
			System.out.println("Middle School age");
		} else if (age >= 13 && age <= 17) {
			System.out.println("Early adolecence");
		} else if (age >= 18 && age <= 25) {
			System.out.println("Later adolecence");
		} else if (age >= 26 && age <= 30) {
			System.out.println("Early adulthood");
		} else if (age >= 31 && age <= 50) {
			System.out.println("Middle adulthood");
		} else if (age >= 51) {
			System.out.println("Later adulthood");
		} else {
			System.out.println("Invalid age");
		}

	}

}
