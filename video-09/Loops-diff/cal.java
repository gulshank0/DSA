import java.util.Scanner;

public class cal {
  public static void main(String[] args) {
    System.out.println("Enter the numbers to perform calculations ");
    Scanner in = new Scanner(System.in);
    // take inputs as operators
    int ans = 0;
    while (true) {
      System.out.println("Enter the operators:");
      char op = in.next().trim().charAt(0);
      if (op == '+' || op == '*' || op == '/' || op == '-' || op == '%') {

        // inputs two numbers
        //
        //
        System.out.println("Enter the two numbers: ")
        
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if (op == '+') {
          ans = num1 + num2;

        }
        if (op == '-') {
          ans = num1 - num2;

        }

        if (op == '%') {
          ans = num1 % num2;

        }
        if (op == '/') {
          if (num2 != 0) {
            ans = num1 / num2;
          }
        }
        if (op == '*') {
          ans = num1 * num2;

        } else if (op == 'X' || op == 'X') {
          break;
        } else {
          System.out.println("Invalid operation");
        }
      }
    }
  }
}
