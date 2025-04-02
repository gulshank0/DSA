import java.util.Scanner;

public class linerSeach {
  public static void main(String[] args) {
    System.out.println("Enter the target value to search ");
    Scanner in = new Scanner(System.in);
    int target = in.nextInt();
    int[] array = { 2, 3, 4, 5, 1, 67, 44, 6 };
    int ans = linearSearch(array, target);
    System.out.println(ans);
  }

  static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      int nums = arr[i];
      if (nums == target) {
        return i;
      }
    }

    return target;
  }
}
