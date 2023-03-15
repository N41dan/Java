package day07_controlFlowStatement;

public class SwitchStatement {
	public static void main(String[] args) {

		int day = 5;

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		default:
			System.out.println("No matching case");
		}

//		String name = "";

//		if (day == 1) {
//			name = "Monday";
//		} else if (day == 2) {
//			name = "Tuesday";
//		} else if (day == 3) {
//			name = "Wednesday";
//		} else if (day == 4) {
//			name = "Thursday";
//		} else if (day == 5) {
//			name = "Friday";
//		} else if (day == 6) {
//			name = "Saturday";
//		} else if (day == 7) {
//			name = "Sunday";
//		} else {
//			System.out.println("Invalid number of the day");
//		}

	}
}
