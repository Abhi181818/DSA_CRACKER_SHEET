import java.util.*;

public class next_Permutation {
//////////////////////////////////////////////////////////
//////////////////////////
//NOT OPTIMAL SOLUTION
//BRUTE FORCE
  public static void main(String[] args) {
    int[] nums = { 3, 2, 1 };
    List<List<Integer>> ls = permute(nums);
    List<Integer> num = new ArrayList<>();
    Arrays.sort(nums);
    for (int numb : nums) {
      num.add(numb);
    }
    int ind = 0;
    for (int i = 0; i < ls.size(); i++) {
      if (ls.get(i).equals(num)) {
        ind = i + 1;
        break;
      }
    }
    if (ind == ls.size()) {
      ind = ls.size() - 1;
    }
    System.out.println(ls.get(ind));
  }

  public static List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();

    res(list, new ArrayList<>(), nums);
    return list;
  }

  private static void res(
    List<List<Integer>> list,
    ArrayList<Integer> tempList,
    int[] nums
  ) {
    if (tempList.size() == nums.length) {
      list.add(new ArrayList<>(tempList));
      return;
    }

    for (int number : nums) {
      if (tempList.contains(number)) continue;
      tempList.add(number);
      res(list, tempList, nums);
      tempList.remove(tempList.size() - 1);
    }
  }
}
