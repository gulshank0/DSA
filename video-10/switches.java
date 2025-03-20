import java.util.Scanner;

public class switches {
  public static void main(String[] args) {
    System.out.println("here we learn about Switch statements");
    Scanner in = new Scanner(System.in);
    String fruits = in.next();

    switch (fruits) {
      case "Mango":
        System.out.println("King of fruits");
        break;

      case "Apple":
        System.out.println("A sweets red fruits");
        break;
      case "Orange":
        System.out.println("It is not a color it is fruits");
      case "Grapes":
        System.out.println("It is a clutered of it");
        break;
      default:
        System.out.println("Please Add a valid fruits");

    }

  }

}
