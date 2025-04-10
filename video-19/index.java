import java.util.Arrays;

public class index {
  public static void main(String[] args) {
    System.out.println("Here we perform Insertion Sorting");
    int[] nums = { 5, 4, 3, 2, 1 };
    InsertionSort(nums);
    System.out.println(Arrays.toString(nums));
  }

  static void InsertionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j > 0; j--) {
        if (arr[j] < arr[j - 1]) {
          swap(arr, j, j - 1);
        } else {
          break;
        }
      }
    }
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}
