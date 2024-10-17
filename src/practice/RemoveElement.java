package practice;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int []nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int n = nums.length;
        int j = n-1, i = n-1, k = 0;
        for(; i>=0; i--){
            if(nums[i] == val){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;

                k++;
                j--;
            }
        }
        System.out.println(Arrays.toString(nums) + " elements = " + (n-k));
    }
}
