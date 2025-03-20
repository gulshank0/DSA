import java.util.Scanner;

public class day {
  public static void main(String[] args) {
    System.out.println("Enter the day to check Holiday");

    Scanner in = new Scanner(System.in);
    String day = in.next();

    switch (day) {
      case "Monday" -> System.out.println("No , It is not Holiday");
      case "Tuesday" -> System.out.println("No , It is not Holiday");
      case "Wednesday" -> System.out.println("No , It is not Holiday");
      case "Thursday" -> System.out.println("No , It is not Holiday");
      case "Friday" -> System.out.println("No , It is not Holiday");
      case "Saturday" -> System.out.println("Yes, It is Holiday");
      case "Sunday" -> System.out.println("Yes , It is  Holiday");

      default -> System.out.println("Enter Valid Day");
    }

  }
}
