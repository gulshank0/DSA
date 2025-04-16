public class Index {
  public static void main(String[] args) {
    System.out.println("Pattern Printing perform here");

    pattern1(4);
    pattern2(5);
  }

  static void pattern1(int n) {
    for (int row = 1; row <= n; row++) {
      for (int cols = 1; cols <= row; cols++) {
        System.out.print("* ");
      }
      System.out.println(" ");

    }

  }

  static void pattern2(int n) {
    for (int rows = 1; rows <= n; rows++) {
      for (int col = 1; col <= rows; col++) {
        System.out.print("* ");
      }
      System.out.println("*");
    }
  }
}
