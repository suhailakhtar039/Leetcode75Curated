package practice;

public class MaximumSumSubarray {
    public static void main(String[] args) {
        int[] nums = {2};

        int n = nums.length;
        int sum = 0, ans = Integer.MIN_VALUE;
        for(int i : nums){
            sum += i;
            ans = Math.max(ans, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println("Sum = " + ans);
    }
}
