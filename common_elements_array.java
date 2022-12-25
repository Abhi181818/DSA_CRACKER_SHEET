import java.util.ArrayList;
import java.util.List;

public class common_elements_array {

  public static void main(String[] args) {
    int[] arr1 = { 1, 5, 10, 20, 40, 90 };
    int[] arr2 = { 9, 10, 20, 50, 90 };
    int[] arr3 = { 10, 20, 70, 90 };
    // comm(arr1, arr2, arr3);
    System.out.println(comm(arr1, arr2, arr3));
  }

  ///////////////////////////
  //////O(n^3)
  public static void common(int[] arr1, int[] arr2, int[] arr3) {
    for (int i : arr1) {
      for (int j : arr2) {
        for (int k : arr3) {
          if (i == j && j == k) {
            System.out.println("" + i);
          }
        }
      }
    }
  }

  //////////////////////////////
  //O(n)

  public static List<Integer> comm(int[] arr1, int[] arr2, int[] arr3) {
    int x = 0, y = 0, z = 0;
    List<Integer> list = new ArrayList<>();
    while (x < arr1.length && y < arr2.length && z < arr3.length) {
      if (arr1[x] == arr2[y] && arr2[y] == arr3[z]) {
        // System.out.print(arr1[x] + " ");
        list.add(arr1[x]);
        x++;
        y++;
        z++;
      } else if (arr1[x] > arr2[y]) {
        y++;
      } else if (arr2[y] > arr3[z]) {
        z++;
      } else {
        x++;
      }
    }
    return list;
  }
}
