import java.util.Arrays;

public class index {
  public static void main(String[] args) {
    System.out.println("CycleSort will be performed Here");
    int[] nums = { 3, 5, 2, 1, 4 };
    CycleSort(nums);
    System.out.println(Arrays.toString(nums));
  }

  static void CycleSort(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int correct = arr[i] - 1;
      if (arr[i] != arr[correct]) {
        swap(arr, i, correct);
      } else {
        i++;
      }
    }
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}
