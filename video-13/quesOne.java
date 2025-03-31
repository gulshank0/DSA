public class quesOne {
  public static void main(String[] args) {
    int[] nums = { 23, 12, 54, 56, 322, 143, 45 };
    int target = 143;
    int ans = linearsearches(nums, target, 3, 6);
    System.out.println(ans);
  }

  static int linearsearches(int[] arr, int target, int start, int end) {
    if (arr.length == 0) {
      return -1;
    }
    for (int index = 0; index < end; index++) {
      int element = arr[index];
      if (target == element) {
        return index;
      }
    }
    return -1;
  }
}
