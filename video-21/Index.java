public class Index {
  public static void main(String[] args) {
    System.out.println("String And String Builders");

    int[] arr = { 2, 3, 4, 5, 6, 322 };
    int a = 30;
    String name = "Kunal Kushawaha";
    System.out.println(name + ": " + a);
    // Strings Are Immutable because of security reasons
    String b = "kunal";
    System.out.println(b);
    b = "Kushawaha";
    System.out.println(b);
  }
}
