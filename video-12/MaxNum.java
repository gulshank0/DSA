
public class MaxNum {
  public static void main(String[] args) {
    int[] arr = { 12, 98, 23, 22, 888, 34, 45 };

    System.out.println(max(arr));

  }

  static int max(int[] arr) {
    int maxVal = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > maxVal) {
        maxVal = arr[i];
      }
    }
    return maxVal;
  }
}
