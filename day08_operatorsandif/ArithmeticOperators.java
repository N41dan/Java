package day08_operatorsandif;

public class ArithmeticOperators {
  public static void main(String[] args) {
    // + - * / %

    // division  with int

    // division with double
//    dataType varName = value;
    double result1 = 10.0 / 3.0;
    System.out.println(result1);

    int result2 = 10 / 3; // 3
    int result3 = 20 / 11; // 1
    System.out.println(result2);
    // because integer can only hold the whole number

    // %
//    10 / 4 = 2 (2 as remainder)
//    50/ 49 = 1 (1 as remainder)
    int result4 = 10 % 3; // 3 * 3 + 1
    int result5 = 10 % 4;
    int result6 = 50 % 49;
    System.out.println(result4);
    System.out.println(result5);
    System.out.println(result6);

    int result7 = 10 % 11;
    System.out.println(result7);

  }
}
