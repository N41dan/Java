package day12_loops_review.exercises;

public class IsPrimeNumber {
  public static void main(String[] args) {
    // number the number that can be divisible by 1 and itself
    int number = 15;

    boolean isPrime = true;

    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        isPrime = false;
        break;
      }
    }

    System.out.println(number + " is prime: " + isPrime);

  }
}
