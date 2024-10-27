package practice.array;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(list, temp, nums);
        System.out.println(list);
    }

    private static void solve(List<List<Integer>> list, List<Integer> temp, int[] nums) {
        if (nums.length == temp.size()) {
            list.add(new ArrayList<>(temp));
        } else {
            for (int num : nums) {
                if (!temp.contains(num)) {
                    temp.add(num);
                    solve(list, temp, nums);
                    temp.remove(temp.size() - 1);
                }
            }
        }
    }
}
