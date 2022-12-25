import java.util.Arrays;

public class merge_sort {

  public static void main(String[] args) {
    int[] array = { 38, 27, 43, 3, 9, 83, 10 };
    mergeSort(array);
    System.out.println(Arrays.toString(array));
  }

  public static void mergeSort(int[] array) {
    int len = array.length;
    if (len == 1) {
      return;
    }
    int mid = len / 2;
    int[] left = new int[mid];
    int[] right = new int[len - mid];
    for (int i = 0; i < mid; i++) {
      left[i] = array[i];
    }
    for (int i = mid; i < len; i++) {
      right[i - mid] = array[i];
    }
    mergeSort(left);
    mergeSort(right);
    merge(array, left, right);
  }

  public static void merge(int[] array, int[] left, int[] right) {
    int lsize = left.length;
    int rsize = right.length;
    int i = 0, j = 0, k = 0;
    while (i < lsize && j < rsize) {
      if (left[i] <= right[j]) {
        array[k] = left[i];
        i++;
      } else {
        array[k] = right[j];
        j++;
      }
      k++;
    }
    /////
    //if we are out of elements
    while (i < lsize) {
      array[k] = left[i];
      i++;
      k++;
    }
    while (j < rsize) {
      array[k] = right[j];
      j++;
      k++;
    }
  }
}
