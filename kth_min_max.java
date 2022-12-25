import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class kth_min_max {

  public static void main(String[] args) {
    int[] arr = { 5, 6, 9, 8, 7, 4, 2, 10 };
    System.out.println(smallest(arr, 3));
  }
////////////////////////////
//using merge sort





  /////////////////////////////////////////////////////////////////////////////
  //USING PRIORITY QUEUE
  public static int smallest(int[] arr, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    for (int i = 0; i < k; i++) {
      pq.add(arr[i]);
    }
    for (int i = k; i < arr.length; i++) {
      if (pq.peek() > arr[i]) {
        pq.poll();
        pq.add(arr[i]);
      }
    }
    return pq.peek();
  }

  public static int largest(int[] arr, int k) {
    //using priority queue
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int i = 0; i < k; i++) {
      pq.add(arr[i]);
    }
    for (int i = k; i < arr.length; i++) {
      if (pq.peek() < arr[i]) {
        pq.poll();
        pq.add(arr[i]);
      }
    }
    return pq.peek();
  }
}
