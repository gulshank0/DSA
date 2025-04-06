import java.util.Arrays;

public class ques1 {
  public static void main(String[] args) {
    System.out.println("Here 1st question of video is going to be solved");
    int[][] nums = {
        { 3, 4, 5 },
        { 4, 5, 6 },
        { 6, 7, 8 }
    };

    System.out.println(Arrays.toString(searchingTwoD(nums, 8)));
  }

  static int[] searchingTwoD(int[][] arr, int target) {
    int row = 0;
    int col = arr.length - 1;
    while (row < arr.length && col >= 0) {
      if (arr[row][col] == target) {
        return new int[] { row, col };
      }
      if (arr[row][col] < target) {
        row++;
      } else {
        col--;
      }
    }
    return new int[] { -1, -1 };
  }
}
