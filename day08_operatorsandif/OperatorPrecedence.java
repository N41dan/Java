package day08_operatorsandif;

public class OperatorPrecedence {
  public static void main(String[] args) {
    int result = 1 * 2 + 3 / 1;
    //            2   +    3    = 5
    System.out.println(result);
    // 1. ()
    // 2. * /
    // 3. + -
    // if they have the same priority always go left -> right
    int result3 = 1/3;
    System.out.println(result3);
    // [for int] smaller number divide by bigger number = 0

    int result2 = 1 / 2 * 3 + 4;
    //              0 * 3
    //                0     + 4  = 4
    System.out.println(result2);
  }
}
