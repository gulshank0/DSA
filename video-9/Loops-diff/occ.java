import java.util.Scanner;

public class occ {
  public static void main(String[] args) {
    System.out.println("Enter the input to check number of repeated number of 3");

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int count = 0;
    while (n > 0) {
      int rem = n % 10;
      if (rem == 3) {
        count++;
      }
      n = n / 10;
    }
    System.out.println(count);
  }
}
