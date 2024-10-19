package practice;

public class FirstAndLastElement {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 4;

        int n = nums.length;
        int st = 0, en = n - 1;
        int mid = (st + en) / 2, ans = -1;
        // first
        while (st <= en) {
            mid = (st + en) / 2;
            if (nums[mid] == target) {
                ans = mid;
                en = mid - 1;
            } else if (nums[mid] < target)
                st = mid + 1;
            else en = mid - 1;
        }

        // second
        st = 0;
        en = n - 1;
        int ans1 = -1;
        while (st <= en) {
            mid = (st + en) / 2;
            if (nums[mid] == target) {
                ans1 = mid;
                st = mid + 1;
            } else if (target > nums[mid])
                st = mid + 1;
            else en = mid - 1;
        }

        System.out.println("First = " + ans + " second = " + ans1);
    }
}
