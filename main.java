
import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    System.out.println("Enter the value to sum ");
    Scanner input = new Scanner(System.in);
    int value1 = input.nextInt();
    int value2 = input.nextInt();

    int sum = value1 + value2;

    System.out.println("the ans =" + sum);

  }
}
