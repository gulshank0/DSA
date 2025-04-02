public class maxWealth {
  public static void main(String[] args) {

    int[][] accountable = {
        { 1, 2, 3 },
        { 4, 3, 4 },
        { 5, 7, 3 }
    };

    int value = maxWealths(accountable);
    System.out.println(value);

  }

  static int maxWealths(int[][] account) {
    int ans = Integer.MIN_VALUE;
    for (int[] ints : account) {
      int customerSum = 0;
      for (int ants : ints) {
        customerSum = customerSum + ants;
      }
      if (customerSum > ans) {
        ans = customerSum;
      }
    }
    return ans;
  }
}
