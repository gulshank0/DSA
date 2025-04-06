public class searchingTwoD {
  public static void main(String[] args) {
    System.out.println("Here we gone perform serching in 2-D Array");

    int[][] nums = {
        { 1, 2, 3 },
        { 2, 4, 5 },
        { 6, 5, 3 }
    };
    int target = 6;
    int ans = searching(nums, target);
    System.out.println(ans);
  }

  static int searching(int[][] arr, int target) {
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        if (arr[row][col] == target) {
          return arr[row][col];
        }
      }
    }
    return -1;
  }
}
