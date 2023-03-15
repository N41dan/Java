package day12_loops_review.reviews;

public class PrintFunction {
  public static void main(String[] args) {
    // String => %s,
    // Int => %d
    // float => %f
    // Character = %c
    // Boolean = %b

    String name = "Leng";
    int year = 2023;
    String occupation = "SDET"; // Software Development Engineer In Test
    double salary = 80_000.00;

    // Leng is working as SDET with $80,000.00 salary in year 2023
    System.out.printf("%S is working as %s with $%.02f salary in year %d\n"
      , name, occupation, salary, year);

    System.out.printf("%d world\n", year);
    System.out.printf("%s", name);
  }
}
