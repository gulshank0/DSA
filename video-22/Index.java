public class Index {
  public static void main(String[] args) {
    System.out.println("Pattern Printing perform here");

    pattern1(4);
  }

  static void pattern1(int n) {
    for (int row = 1; row <= n; row++) {
      for (int cols = 1; cols <= row; cols++) {
        System.out.print("* ");
      }
      System.out.println(" ");

    }

  }
}
