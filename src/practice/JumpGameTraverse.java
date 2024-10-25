package practice;

public class JumpGameTraverse {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};


        int n = nums.length;
        int last = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            if (i + nums[i] >= last)
                last = i;
        }
        System.out.println(last);
    }
}
