package practice.array;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int i = 0, j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                System.out.println((i + 1) + " " + (j + 1));
                System.exit(0);
            } else if (sum > target) j--;
            else i++;
        }
    }
}
