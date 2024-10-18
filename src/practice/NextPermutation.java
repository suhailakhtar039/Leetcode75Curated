package practice;


import java.util.Arrays;

public class NextPermutation {

    public static void reverse(int[] arr, int idx1, int idx2){
        int n = arr.length;
        System.out.println("Before reversing = " + Arrays.toString(arr));
        while(idx1 < idx2){
            int t = arr[idx1];
            arr[idx1] = arr[idx2];
            arr[idx2] = t;
            idx1++;
            idx2--;
        }
        System.out.println("After reversing = " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 4};

        int n = nums.length;
        int idx1 = -1, idx2 = -1;
        for(int i = n-2; i >= 0; i--){
            if(nums[i+1] > nums[i]){
                idx1 = i;
                break;
            }
        }

        if(idx1 == -1){
            System.out.println("=====highest=====");
            System.out.println(Arrays.toString(nums));
            System.exit(0);
        }

        for(int i = n-1; i>=0; i--){
            if(nums[i] > nums[idx1]){
                idx2 = i;
                break;
            }
        }
        int t = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = t;

        reverse(nums, idx1+1, n-1);

        System.out.println(Arrays.toString(nums));

    }
}
