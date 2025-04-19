public class Fibonnacci {
  public static void main(String[] args) {
    System.out.println("Fibonnacci is going to perform");
    System.out.println(fibb(8));
  }

  static int fibb(int n) {
    if (n < 2) {
      return n;
    }
    return fibb(n - 1) + fibb(n - 2);
  }
}
