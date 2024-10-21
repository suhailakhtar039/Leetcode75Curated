package practice;

import java.util.ArrayList;
import java.util.List;

public class Combinationsum1 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 7};
        int target = 6;


        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        int sum = 0, idx = 0;
        List<Integer> list = new ArrayList<>();
        solve(ans, nums, list, 0, idx, target);
        System.out.println(ans);
    }

    public static void solve(List<List<Integer>> ans, int[] nums, List<Integer> list, int sum, int i, int target) {
        if (sum > target) return;
        if (sum == target) {
            List<Integer> l = new ArrayList<>(list);
            // System.out.println("inside if = " + list + " l = " + l);
            ans.add(l);
            System.out.println("ans = " + ans);
            return;
        }
        // System.out.println("sum = " + sum);
        for (int j = i; j < nums.length; j++) {
            list.add(nums[j]);
            solve(ans, nums, list, sum + nums[j], j, target);
            list.remove(list.size()-1);
            // System.out.println(list);
        }
    }
}
