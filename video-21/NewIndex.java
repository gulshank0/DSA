public class NewIndex {
  public static void main(String[] args) {
    System.out.println("Here we going to perform how to create new objects of same values");

    String a = "kunal";
    String b = "kunal";
    System.out.println(a == b);


    String x=new String("kunal");
    String y=new String("kunal");
    System.out.println(x==y);
  }
}
