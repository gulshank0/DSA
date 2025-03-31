public class linearSearch {
  public static void main(String[] args) {
    System.out.println("Here we search across the thing and print out index of that");
    // started code from Here
    {
      int[] nums= { 23, 445, 6, 33, 124, 56, 322, 56 };
      int target = 322;
      int ans = linearsearches(nums, target);
      System.out.println(ans);
    }
  }

  static int linearsearches(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }
    for (int index = 0; index < arr.length; index++) {
      int element = arr[index];
      if (target == element) {
        return index;
      }
    }
    return -1;
  }
}
