package practice.array;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;


        int n = nums.length;
        int st = 0, en = n - 1;
        int mid = (st + en) / 2;
        int prev = mid;
        while (st <= en) {
            prev = mid;
            mid = (st + en) / 2;
            if (nums[mid] == target) {
                prev = mid;
                break;
            } else if (nums[mid] > target)
                en = mid - 1;
            else st = mid + 1;
        }
        System.out.println(st);
    }
}
