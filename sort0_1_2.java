public class sort0_1_2 {

  public static void main(String[] args) {
    int[] arr = { 1, 1, 1, 2, 2, 0, 0, 2, 1 };
    sort(arr);
    for (int i : arr) {
      System.out.print(i);
    }
  }

  public static void sort(int[] arr) {
    int[] temp = { 0, 0, 0 };
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) temp[0]++; else if (arr[i] == 1) temp[1]++; else if (
        arr[i] == 2
      ) temp[2]++;
    }
    for (int i = 0; i < temp[0]; i++) {
      arr[i] = 0;
    }
    for (int i = temp[0]; i <= temp[0] + temp[1]; i++) {
      arr[i] = 1;
    }
    for (int i = temp[1] + temp[0]; i < temp[0] + temp[1] + temp[2]; i++) {
      arr[i] = 2;
    }
  }
}
