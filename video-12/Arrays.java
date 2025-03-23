import java.util.Scanner;

public class Arrays {

  public static void main(String[] args) {

    System.out.println("Here we understand the concept of Arrays");
    Scanner in = new Scanner(System.in);
    int[] arr = new int[5];
    for (int i = 0; i < arr.length; i++) {

      arr[i] = in.nextInt();

    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
