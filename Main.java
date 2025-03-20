import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("ENTER THE VALUE TO MAKE SUM THEM");

    Scanner input = new Scanner(System.in);

    int value1 = input.nextInt();
    int value2 = input.nextInt();

    int sum = value1 + value2;

    System.out.println("The sum of your input is :" + sum);

  }
}
