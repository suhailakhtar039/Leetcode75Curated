package practice.array;

import java.util.Arrays;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 8;

        int sum = 0;
        sum = Arrays.stream(nums).sum();
        if(sum<target){
            System.out.println(0);
            System.exit(1);
        }

        int i = 0, j = 0, sz = Integer.MAX_VALUE, tempSum = 0;
        while(i < nums.length){
            if(tempSum < target)
                tempSum+=nums[i];
            while(tempSum >= target){
                sz = Math.min(sz, i-j+1);
                tempSum-=nums[j];
                j++;
            }
            i++;
        }
        System.out.println(sz);
    }
}
