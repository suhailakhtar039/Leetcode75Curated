package practice.array;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3,4,1,2};

        int n = nums.length;
        // remove all negative and element greater tha n n to n+2
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n){
                nums[i] = n+2;
            }

        }
        for(int i =0 ;i<n; i++){
            int a = Math.abs(nums[i]);
            if(a > n)continue;
            nums[Math.abs(nums[i]) - 1] = -Math.abs(nums[Math.abs(nums[i]) - 1]);
        }
        System.out.println("array = " + Arrays.toString(nums));
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                System.out.println(i + 1);
                System.exit(0);
            }
        }
        System.out.println("=== " + n+1);
    }
}
