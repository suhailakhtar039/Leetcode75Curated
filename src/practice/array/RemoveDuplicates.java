package practice.array;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,4};

        int j = 0, n = nums.length;
        for(int i = 0; i < n-1; i++){
            if(nums[i+1]!=nums[i]){
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[n-1];
        System.out.println(j);
        System.out.println(Arrays.toString(nums));
    }
}
