package day16_string_review.exercises;

public class PrintPrimeNumber {
  public static void main(String[] args) {
    /**
     * ## Task - Prime numbers
     *
     * Write program that can print all prime numbers until the input number
     *
     * ```text
     * input:
     * > 20
     * output:
     * > 2,3,5,7,11,13,17,19
     *
     * input:
     * > 5
     * output:
     * > 2,3,5
     * ```
     */

    int input = 100;
    for (int number = 2; number <= input ; number++) {

      // our old isPrime logic
      boolean isPrime = true;
      for (int j = 2; j < number; j++) {
        if (number % j == 0) {
          isPrime = false;
          break;
        }
      }

      if (isPrime) System.out.print(number + ",");
    }
  }
}
