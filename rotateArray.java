public class rotateArray {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    reverse(arr, 12);
    // System.out.println(arr.toString());
  }

  public static void reverse(int[] arr, int k) {
    k = k % arr.length;
    if (k < 0) k = k + arr.length;
    int[] temp = new int[arr.length];
    for (int i = arr.length - k, j = 0; i < arr.length && j < k; j++, i++) {
      temp[j] = arr[i];
    }
    for (int i = k, j = 0; i < arr.length && j < arr.length - k; j++, i++) {
      temp[i] = arr[j];
    }
    for (int i : temp) {
      System.out.print(i);
    }
  }
}
