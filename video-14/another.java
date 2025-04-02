public class another {
  public static void main(String[] args) {

    int[] nums = { 2, 3, 22, 33, 45, 47, 88, 99, 700 };
    int target = 88;
    int ans = BinarySearch(nums, target);
    System.out.println(" The Index of the target value is : "+ans);

  }

  // return -1 if it does not exist
  static int BinarySearch(int[] arr, int target) {
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
    return -1;
  }

}
