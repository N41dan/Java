package day04_1streview;

public class EscapeSequence {
  public static void main(String[] args) {
    // "cat"
    // \"  => "
    // \n  => new line  (enter)
    // \t  => tab character
    // \\  => \
    // \r  => carat feed

    //    System.out.println("\"cat\"");
//    System.out.println("*\n*");
    System.out.println("*\t\t*");
    System.out.println("\\user\\lib\\src");
    System.out.println("\\user\\lib\\src");
    System.out.println("Today\nTomorrow");
    System.out.println("Tomorrow");
  }
}
