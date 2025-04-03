
public class ques2 {
  public static void main(String[] args) {
    System.out.println(" hi there this is ques 1");
    int[] nums = { 2, 3, 4, 15, 17, 87, 99 };
    int target = 88;
    int ans = floor(nums, target);
    System.out.println(ans);
  }

  static int floor(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {

      int mid = start + (end - start) / 2;
      if (target < arr[mid]) {
        end = mid - 1;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        return mid;
      }
    }
    return end;
  }
}
