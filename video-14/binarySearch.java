import java.util.Scanner;

public class binarySearch {
  public static void main(String[] args) {
    System.out.println("Enter the target value to search as binarySearch");
    Scanner in = new Scanner(System.in);
    int[] nums = { 23, 44, 56, 76, 88, 90 };
    int inputarget = in.nextInt();
    int ans = BinarySearch(nums, inputarget);
    System.out.println(ans);
  }

  // return -1 if it does not exist
  static int BinarySearch(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end) / 2;
      if (target < arr[mid]) {
        end = mid - 1;
        return arr[target];
      } else if (target > arr[mid]) {
        start = mid + 1;
        return arr[target];
      } else {
        return mid;
      }
    }
    return -1;
  }
}
