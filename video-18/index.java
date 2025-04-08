import javax.crypto.AEADBadTagException;

public class index {
  public static void main(String[] args) {
    System.out.println("Here we gone perform Selection sort");
    int[] nums = { 1, 43, 2, 23, 44, 55, 43, 88 };
  }

  static void selectionSort(int[] arr) {
  // find the maximum item in the remaing array and swap with correct index
    int last=arr.length -i-1;
    int maxIndex=getMaxindex(int[] arr, int i,int last);

  }

  private static int getMaxindex(int[] arr, int start, int end) {
    int max = start;
    for (int i = start; i <= end; i++) {
      if (arr[max] < arr[i]) {
        max = i;
      }
    }
    return max;
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;

  }
}
