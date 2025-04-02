public class evenDigits {
  public static void main(String[] args) {
    int[] nums = { 12, 3, 4, 1234, 8, 7, 88 };
    System.out.println(findNumber(nums));
  }

  static int findNumber(int[] nums) {
    int count = 0;
    for (int num : nums) {
      if (even(num)) {
        count++;
      }
    }
    return count;
  }

  static boolean even(int num) {
    int numberOfDigits = digits(num);

    return numberOfDigits % 2 == 0;
  }

  static int digits(int num) {
    int count = 0;

    while (num > 0) {
      count++;
      num = num / 10;
    }

    return count;
  }

}
