public class SumNum {
  public static void main(String[] args) {
    System.out.println("sum of array");
    int[] nums = { 2, 3, 4, 5, 6 };
    int ans = sum(nums);
    System.out.println(ans);
  }

  static int sum(int[] arr) {
    int sumValue = 0;

    for (int i = 0; i < arr.length;  i++) {
      sumValue += arr[i];
    }
    return sumValue;
  }
}
