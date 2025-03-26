import java.util.Arrays;

public class temp3 {
  public static void main(String[] args) {
    int[] arr = { 12, 23, 22, 34, 45 };

    swap(arr, 0, 4);

    System.out.println(Arrays.toString(arr));
  }

  static void swap(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }
}
