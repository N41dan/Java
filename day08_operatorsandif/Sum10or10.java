package day08_operatorsandif;

public class Sum10or10 {
  public static void main(String[] args) {
    // Given 2 ints, a and b,
    int a = 7;
    int b = 5;
    boolean result = false;
    // return true if
    if (
        a == 10 // a is 10
            || b == 10 // b is 10
            || a + b == 10 // or if their sum is 10.
    ) {
      result = true;
    }

    System.out.println("result = " + result);

  }
}
