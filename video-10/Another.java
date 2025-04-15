import java.util.Scanner;

public class Another {
  public static void main(String[] args) {
    System.out.println("Here we lean cleaner syntax in java ");

    Scanner in = new Scanner(System.in);
    String fruits = in.next();

    switch (fruits) {
      case "Mango" -> System.out.println("It is King of fruits");
      case "Grapes" -> System.out.println("It is Clusterd of fruits");
      case "Oranges" -> System.out.println("It is rounded fruits");
      default -> System.out.println("Please Enter the valid fruits");
    }
  }}