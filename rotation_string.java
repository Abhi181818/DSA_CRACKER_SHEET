public class rotation_string {

  public static void main(String[] args) {
    if (isRotation("abad", "baac")) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
  }

  public static boolean isRotation(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    }
    String st = str1 + str1;
    if (st.indexOf(str2) != -1) {
      return true;
    }
    return false;
  }
}
