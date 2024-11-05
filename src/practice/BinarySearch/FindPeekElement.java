package practice.BinarySearch;

public class FindPeekElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};


        int n = nums.length;
        int st = 0, en = n - 1;
        while (st <= en) {
            int mid = (st + en) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                System.out.println(mid);
                break;

            } else if (nums[mid] < nums[mid - 1]) en = mid - 1;
            else st = mid + 1;
        }
    }
}
