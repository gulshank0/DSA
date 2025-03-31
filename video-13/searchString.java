public class searchString {
  public static void main(String[] args) {
    System.out.println("Searching in the Strings");
    String name = "Harkirat";
    char target = 'T';
    System.out.println(search(name, target));
  }

  static boolean search(String str, char target) {
    if (str.length() == 0) {
      return false;
    }
    for (int index = 0; index < str.length(); index++) {
      if (str.charAt(index) == target) {
        return true;
      }
    }

    return false;
  }

}
