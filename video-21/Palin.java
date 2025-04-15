import java.util.Scanner;

public class Palin {
  public static void main(String[] args) {
    System.out.println("Here we solved palindrome");

    Scanner in = new Scanner(System.in);
    String input = in.next();
    System.out.println(isPalindrome(input));
  }

  static boolean isPalindrome(String str) {
    str = str.toLowerCase();
    for (int i = 0; i <= str.length() / 2; i++) {
      char start = str.charAt(i);
      char end = str.charAt(str.length() - 1 - i);
      if (start != end) {
        return false;
      }
    }
    return true;
  }
}
