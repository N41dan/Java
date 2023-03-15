package day08_operatorsandif;

public class CompoundAssignmentOperator {
  public static void main(String[] args) {
    // = use to assign value to variable
    // Only operation that read from right to left

    // Compound assignment operator

    int a = 1;
    a += 2; // a = a + 2
    a *= 4;
    a /= 2;
    System.out.println(a);

    a++; // a += 1;
    a--; // a -= 1;

    // a -= 3;    a = a - 3
    // a *= 4;    a = a * 4
    // a /= 5;    a = a / 5
  }
}
