import java.util.Arrays;

public class cyclic_rotate {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    for(int i=1;i<3;i++){
        cycle(arr);
    }
    System.out.println(Arrays.toString(arr));
  }

  public static void cycle(int[] arr) {
    int last = arr[arr.length - 1];
    for (int i = arr.length - 1; i > 0; i--) {
      arr[i] = arr[i - 1];
    }
    arr[0] = last;
  }
}
