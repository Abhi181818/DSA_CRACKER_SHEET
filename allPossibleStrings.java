import javax.management.relation.RelationTypeNotFoundException;

public class allPossibleStrings {

  public static void main(String[] args) {
    String str = "abc";
    permut(str, "");
  }

  public static void permut(String s, String p) {
    if (s.length() == 0) {
      System.out.println(p);
      return;
    }
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      String c = s.substring(0, i) + s.substring(i + 1);
      permut(c, p + ch);
    }
  }
}
