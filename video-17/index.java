import java.util.Arrays;

public class index {
  public static void main(String[] args) {
    System.out.println("Here we gone perform bubble sort");
    int[] nums = { 12, 36, 22, 45, 65, 55, 43, 1 };
    bubble(nums);
    System.out.println(Arrays.toString(nums));
  }

  static void bubble(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 1; j < arr.length - i; j++) {
        // swap the item is smaller than the previous items
        if (arr[j] < arr[j - 1]) {
          // swap
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        }
      }
    }
  }
}
