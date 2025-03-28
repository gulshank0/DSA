public class sum {
  public static void main(String[] args) {
    int[] arr = { 12, 23, 22, 34, 45 };

    System.out.println(sum(arr));
  }

  static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }
}
