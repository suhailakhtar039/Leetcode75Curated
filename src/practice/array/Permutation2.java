package practice.array;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation2 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};

        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] used = new boolean[n];
        solve(nums, res, temp, used);
        System.out.println(res);
    }

    private static void solve(int[] nums, List<List<Integer>> res, List<Integer> temp, boolean[] used) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i]) continue;
                if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
                used[i] = true;
                temp.add(nums[i]);
                solve(nums, res, temp, used);
                temp.remove(temp.size() - 1);
                used[i] = false;

            }
        }
    }
}
