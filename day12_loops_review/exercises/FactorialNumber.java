package day12_loops_review.exercises;

public class FactorialNumber {
  public static void main(String[] args) {
    int number = 20;
    // 5 * 4 * 3 *2 *1 = total
    long total = 1;

    for (int i = 2; i <= number; i++) {
      total *= i;
    }

    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(total);
  }
}
