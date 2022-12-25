public class search_2d_matrix {

  public static void main(String[] args) {
    int[][] mat = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
    if (matrix(mat, 30)) {
      System.out.println("found");
    } else {
      System.out.println("not found");
    }
  }

  public static boolean matrix(int[][] mat, int k) {
    for (int[] is : mat) {
      for (int i : is) {
        if (i == k) {
          return true;
        }
      }
    }
    return false;
  }
}
