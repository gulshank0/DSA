public class SB {
  public static void main(String[] args) {
    System.out.println("Here we test String builder");

    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < 26; i++) {
      char ch = (char) ('a' + i);
      builder.append(ch);
    }
    System.out.println(builder.toString());
    builder.deleteCharAt(0);
    System.out.println(builder);
    builder.reverse();
    System.out.println(builder);
  }
}
