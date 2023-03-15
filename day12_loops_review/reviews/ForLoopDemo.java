package day12_loops_review.reviews;

public class ForLoopDemo {
  public static void main(String[] args) {
    // Forloop
    //    for (
    //        initialize_counter;
    //        boolean_condition;
    //        increment / decrement
    //    ) {
    //      // code here
    //      // another
    //    }

    for (int i = 0, j = 0; i < 5; i++, j+=2 ) {
      System.out.println("Hi");
      System.out.println(i + " : " +j);
    }

    // i will not accessible outside forloop
    //    System.out.println(i);

  }
}
