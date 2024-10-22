package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinationsum2 {
    public static void main(String[] args) {
        int[] nums = {2,5,2,1,2};
        int target = 5;


        Arrays.sort(nums);
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
            // System.out.println("ans = " + ans);
            return;
        }
        // System.out.println("sum = " + sum);
        for (int j = i; j < nums.length; j++) {
            if(j>i && nums[j] == nums[j-1])continue;
            list.add(nums[j]);
            solve(ans, nums, list, sum + nums[j], j+1, target);
            list.remove(list.size()-1);
            // System.out.println(list);
        }
    }
}
