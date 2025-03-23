public class stringReturning {
  public static void main(String[] args) {
    System.out.println("Enter The String to return");
    String in = greet();
    System.out.println(in);
  }

  static String greet() {
    String greeting = "How are you";

    return greeting;
  }
}
