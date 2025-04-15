import java.util.Scanner;
import java.util.stream.DoubleStream.Builder;

public class Palindrome {
  public static void main(String[] args) {
    System.out.println("Here we chack given word is Palindrome or not");
    Scanner in = new Scanner(System.in);
    String ans = in.next();
    StringBuilder OutputAns = in.reverse();
    if (ans == OutputAns) {
      System.out.println("This is Palindrome");
    }
  }
}
