package day12_loops_review.reviews;

public class SwitchStatement {
  public static void main(String[] args) {
    // switch statement
    // if else (condition) {
    //    somecode
    // }

    String role = "";

    switch (role) {
      case "guest":
        System.out.println("You are guest");
        break;
      case "vendor":
        System.out.println("You are vendor");
        break;
      case "admin":
        System.out.println("You are admin");
        break;
      default:
        System.out.println("Invalid role");
    }




  }
}
