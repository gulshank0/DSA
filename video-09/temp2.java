import java.util.Scanner;

public class temp2 {
  public static void main(String[] args) {
    System.out.println("Enter the value of salary");
    Scanner in = new Scanner(System.in);

    int salary = in.nextInt();

    if (salary >= 8000) {
      System.out.println(salary += 2000);
      // It is similar to salary = salary + 2000
    } else {
      System.out.println(salary += 5000);
      // It is also similar to salary = salary + 5000
    }

    in.close(); // Closing the scanner to avoid resource leaks
  }
}
