import java.util.Scanner;

public class for_loop {
  public static void main(String[] args) {
    System.out.println("Implementing for loop only");
    System.out.println("Printing value upto n number ");

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int i = 0; i <= n; i++) {

      System.out.print("  " + i);
    }
  }
}
