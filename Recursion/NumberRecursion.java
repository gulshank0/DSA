public class NumberRecursion {
  public static void main(String[] args) {
    System.out.println("Recursion: function calling itself");
    print(1);
  }

  static void print(int n) {

    // Base condition =>
    if (n == 5) {
      System.out.println("5");
      return;
    }
    System.out.println(n);
    print(n + 1);
  }
}
