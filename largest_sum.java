public class largest_sum {

  public static void main(String[] args) {
    int[] arr = { -9, -2, 7, 4, 1, -1, 9 };
    int k = 7;
    System.out.println(sec(arr));
    // if (rem(arr, k)) {
    //   System.out.println("true");
    // } else {
    //   System.out.println("false");
    // }
  }

  public static boolean rem(int[] arr, int k) {
    for (int i = 0; i < arr.length; i++) {
      int currSum = 0;
      int j;
      for (j = i; j < arr.length; j++) {
        currSum += arr[j];
      }
      if (currSum % k == 0 && j - i > 1) {
        return true;
      }
    }
    return false;
  }

  ////////////////////////////////////////////
  public static int largest(int[] arr) {
    int maxSum = arr[0];
    for (int i = 0; i < arr.length; i++) {
      int currSum = 0;
      for (int j = i; j < arr.length; j++) {
        currSum = currSum + arr[j];
        if (currSum < 0) {
          currSum = 0;
        } else {
          maxSum = Math.max(maxSum, currSum);
        }
      }
    }
    return maxSum;
  }

  ///////////////////////////////
  //second method

  public static int sec(int[] arr) {
    int max = 0;
    int curr = 0;
    for (int i = 0; i < arr.length; i++) {
      curr += arr[i];
      if (curr > max) {
        max = curr;
      }
      if (curr < 0) {
        curr = 0;
      }
    }
    return max;
  }
}
