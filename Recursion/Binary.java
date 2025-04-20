public class Binary {
  public static void main(String[] args) {
    System.out.println("Binary Serach using Recurrion");
    int[] nums = { 2, 3, 5, 6, 7, 8, 9, 44, 45, 66, 77, 88 };
    int ans = search(nums, 77, 0, nums.length - 1);
    System.out.println(ans);
  }

  static int search(int[] arr, int target, int s, int e) {
    if (s > e) {
      return -1;
    }
    int m = s + (e - s) / 2;
    if (arr[m] == target) {
      return m;
    }
    if (target < arr[m]) {
      return search(arr, target, s, m - 1);
    }
    return search(arr, target, m + 1, e);
  }
}
