import java.util.Scanner;

public class occurance {
  public static void main(String[] args) {
    System.out.println("Enter the value which have big and repeatative number");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    int count = 0;

    while (n > 0) {
      int rem = n % 10;
      if (rem == 5) {
        count++;
      }
      n = n / 10;

    }
System.out.println(count);
  }
}
