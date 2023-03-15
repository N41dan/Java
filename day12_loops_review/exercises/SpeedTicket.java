package day12_loops_review.exercises;

import java.util.Scanner;

public class SpeedTicket {
  public static void main(String[] args) {
    /**
     * **Rules to calculate fine:**
     *
     * 1. if driver is less than 5mph over limit, no fine is assessed, but you finish all prompts,
     *    calculations and generate the report.
     * 2. else if driver is over limit by 20mph or less, charge $30 per every 5mph over limit.
     * 3. else if driver is more than 20mph over limit charge $50 per every 5 mph over limit.
     * 4. Don't mix rates! - driver is either charged $30 per 5mph over or $50 per 5mph over.
     * 5. if the violation occurred in a construction zone, you are to **DOUBLE** the fine.
     *
     * Lastly -- AFTER ALL OTHER CALCULATIONS ARE DONE: if driver is under 21 AND more than 20mph over limit then you must add
     * an additional straight $300 underage speeder fine. ** You are NOT to double this
     */

    Scanner sc = new Scanner(System.in);
    System.out.println("What is driver's first name?");
    String firstName = sc.nextLine();
    System.out.println("What is driver's last name?");
    String lastName = sc.nextLine();
    System.out.println("What is driver's age?");
    int age = sc.nextInt();
    System.out.println("What is the speed limit? (mph)");
    int speedLimit = sc.nextInt();
    System.out.println("What is the driver's speed? (mph)");
    int currentSpeed = sc.nextInt();
    sc.nextLine();
    System.out.println("Is this a construction zone? (y/n)");
    char isConstruction = sc.nextLine().charAt(0);
    final int THIRTY = 30, FIFTY = 50, UNDERAGE_FINE = 300;
    int overSpeed =  currentSpeed - speedLimit;

    int fine = 0;
    if (overSpeed <= 20) fine = overSpeed / 5 * THIRTY;
    else fine = overSpeed / 5 * FIFTY;

    // is it in construction zone?
    if (isConstruction == 'y') fine *= 2;

    // underage + over 20 mph
    if (age < 21 && overSpeed > 20) fine += UNDERAGE_FINE;

    System.out.println("fine: $" + fine);
    System.out.println("=========REPORT=========");
    System.out.println("Driver name:");
    System.out.printf("\t%s %s\n", firstName, lastName);
    System.out.println("\t" + firstName + " " + lastName);
    System.out.println("Age:");
    System.out.printf("Speed limit:\t%d mph\n", speedLimit);
    System.out.printf("Current speed:\t%d mph\n", currentSpeed);
    System.out.printf("Construction zone (y/n)?: %c\n", isConstruction);
    System.out.printf("Speeding fine:\t$%d.00\n", fine);
    System.out.println("==========END===========");

  }
}
