public class Index {
  public static void main(String[] args) {
    System.out.println("Pattern Printing perform here");

    // pattern1(6);
    // pattern2(5);
    // pattern3(6);
    // pattern4(6);
 //   pattern5(5);
     pattern6(6);
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
      for (int col = 1; col <= n; col++) {
        System.out.print("* ");
      }
      System.out.println("*");
    }
  }

  static void pattern3(int n) {
    for (int row = 1; row <= n; row++) {
      for (int cols = row; cols <= n; cols++) {
        System.out.print("* ");
      }
      System.out.println();

    }
  }

  static void pattern4(int n) {
    for (int row = 1; row <= n; row++) {
      for (int cols = 1; cols <= row; cols++) {
        System.out.print(cols);
      }
      System.out.println(" ");

    }

  }

  static void pattern5(int n) {
    for (int rows = 1; rows <= 2 * n; rows++) {
      int totalCols = rows > n ? 2 * n - rows : rows;
      for (int col = 1; col <= totalCols; col++) {
        System.out.print("*  ");
      }
      System.out.println();
    }
  }

  static void pattern6(int n) {
    for (int row = 0; row <= 2*n; row++) {
      int totalCols = row > n ? 2 * n - row : row;
      int noOfSpaces = n - totalCols;
      for (int s = 0; s < noOfSpaces; s++) {
        System.out.print(" ");
      }
      for (int cols = 0; cols <= totalCols; cols++) {
        System.out.print("* ");
      }
      System.out.println();

    }
  }

}
