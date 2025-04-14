import java.util.Scanner;

public class tem1 {
  public static void main(String[] args) {
    System.out.println("Enter the value which is higher ");

    Scanner input = new Scanner(System.in);
    int salary = input.nextInt();

    if (salary == 40000) {
      System.out.println("He is rich ");
    } else {
      System.out.println("He is pooorr");
    }

  }
}
