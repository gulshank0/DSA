import java.util.Scanner;

public class function {
  public static void main(String[] args) {

    int ans = sum2();
    System.out.println(ans);
  }

  static int sum2() {
    System.out.println("Hi there this section covers function in Java");
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the First Number");
    int input1 = in.nextInt();
    System.out.println("Enter the Second Number");
    int input2 = in.nextInt();
    int sum = input1 + input2;
    return sum;
  }

  static void Sum() {
    System.out.println("Hi there this section covers function in Java");
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the First Number");
    int input1 = in.nextInt();
    System.out.println("Enter the Second Number");
    int input2 = in.nextInt();
    int sum = input1 + input2;
    System.out.println("The sum is :" + sum);
  }
}
