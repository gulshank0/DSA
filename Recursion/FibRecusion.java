public class FibRecusion {
  public static void main(String[] args) {
    System.out.println(" returning series of the fibonacci");
    System.out.println(Fib(8));
  }

  static int Fib(int n) {
    int n1 = 0;
    int n2 = 1;
    int next;

    return Fib(n - 1) + Fib(n - 2);
  }
}
