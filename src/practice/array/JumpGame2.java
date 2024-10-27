package practice.array;

public class JumpGame2 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 0, 1, 4};

        int n = nums.length;
        int ans = 0, prev = 0, curMax = 0;
        for (int i = 0; i < n - 1; i++) {
            curMax = Math.max(curMax, i + nums[i]);
            if (i == prev) {
                ans++;
                prev = curMax;
            }
        }
        System.out.println(ans);
    }
}
