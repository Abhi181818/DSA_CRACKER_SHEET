import java.util.*;

public class negativeToOneSIde {

  public static void main(String[] args) {
    int[] arr = { -1, -2, 5, -1, -5, 6, 7, 8 };
    sort(arr);
    List<Integer> res = new ArrayList<>();
    for (int i : arr) {
        res.add(i);
    }
    System.out.println(res.toString());
  }

  public static void sort(int[] arr) {
    int lo = 0;
    int hi = arr.length - 1;
    while (lo < hi) {
      if (arr[lo] > 0) {
        if (arr[hi] < 0) {
          int temp = arr[lo];
          arr[lo] = arr[hi];
          arr[hi] = temp;
        } else {
          hi--;
        }
      } else {
        lo++;
      }
    }
  }
}
