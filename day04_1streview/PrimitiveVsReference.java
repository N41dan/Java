package day04_1streview;

import java.util.Arrays;

// most of the class that you use til now
// it came form java.lang
public class PrimitiveVsReference {
  public static void main(String[] args) {
    // Copy value
    int x = 1;
    int y = x; // y = 1
    System.out.println(x);
    System.out.println(y);

    x = 2; // x = 2
    System.out.println(x);
    System.out.println(y);

//    // Reference Type
    int[] a = {1};
    int[] b = a; // b = {1} // copy by address @
    System.out.println(a); // this will print the address of 'a'
    System.out.println(b);

    a[0] = 2; // a = {2} // changing a value
    System.out.println(Arrays.toString(a)); // this will print the value of 'a'
    System.out.println(Arrays.toString(b));

  }
}
