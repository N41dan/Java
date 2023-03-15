package day07_controlFlowStatement;

public class MultiBranchIfStatement {

	public static void main(String[] args) {
		/*
		 * syntax:
		 * 
		 * if (condition1) {
		 * 
		 * } else if (condition2) {
		 * 
		 * }else if (condition3) {
		 * 
		 * }else { default statement; }
		 */

		int day = 3;
		String name = "";

		if (day == 1) {
			name = "Monday";
		} else if (day == 2) {
			name = "Tuesday";
		} else if (day == 3) {
			name = "Wednesday";
		} else if (day == 4) {
			name = "Thursday";
		} else if (day == 5) {
			name = "Friday";
		} else if (day == 6) {
			name = "Saturday";
		} else if (day == 7) {
			name = "Sunday";
		} else {
			System.out.println("Invalid number of the day");
		}

		System.out.println("its " + name);

//		if (day == 1) {
//			System.out.println("Monday");
//		} else if (day == 2) {
//			System.out.println("Tuesday");
//		}else if (day==3) {
//            System.out.println("Wednesday");
//        } else if (day==4) {
//            System.out.println("Thursday");
//        } else if (day==5) {
//            System.out.println("Friday");
//        } else if (day==6) {
//            System.out.println("Saturday");
//        } else if (day==7) {
//            System.out.println("Sunday");
//        } else {
//            System.out.println("Invalid number of the day");
//        }

	}

}
