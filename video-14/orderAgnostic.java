public class orderAgnostic {
  public static void main(String[] args) {
    System.out.println("Here we gone check if an array is sorted or not :");

    int[] nums = { 2, 3, 22, 33, 45, 47, 88, 99, 700 };
    int[] nums2 = { 90, 88, 47, 45, 33, 22, 7, 3, 2, 1 };
    int target = 88;
    int ans = OrderAgnostisBS(nums2, target);
    System.out.println(" The Index of the target value is : " + ans);

  }

  static int OrderAgnostisBS(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    boolean isAscending;
    if (arr[start] < arr[end]) {
      isAscending = true;
    } else {
      isAscending = false;
    }
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        return mid;
      }
      if (isAscending) {
        if (target < arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;

        }
      } else {
        if (target > arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;

        }
      }
    }
    return -1;
  }
}
