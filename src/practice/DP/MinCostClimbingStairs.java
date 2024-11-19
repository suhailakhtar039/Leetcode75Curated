package practice.DP;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] nums = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

        int n = nums.length;
        for(int i = 2; i<n; i++){
            nums[i] += Math.min(nums[i-1], nums[i-2]);
        }
        System.out.println(Math.min(nums[n-1],nums[n-2]));
    }
}
