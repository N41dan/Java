package day16_string_review;

public class CompareString {
  public static void main(String[] args) {
    // Reference type cannot use  ==  or  !=
    String str1 = "myString";
    System.out.println(str1.equals("myString")); // true
    System.out.println(str1.equalsIgnoreCase("mystring")); // true


  }
}
