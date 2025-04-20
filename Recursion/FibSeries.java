public class FibSeries {
  public static void main(String[] args) {
    System.out.println("Printing series of fibonacci");
    // int ans = Fib(8);
    int n = 8;
    int firstValue = 0;
    int secondValue = 1;

    for (int i = 0; i < n; i++) {
      int nextValue = firstValue + secondValue;
      System.out.println(nextValue);
      firstValue = secondValue;
      secondValue = nextValue;
    }
  }

}
