package practice.array;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5,6,7,0,1,2};

        int target = 8;
        int n = nums.length;
        int idx = -1;
        int start = 0, end = n-1;
        while(start <= end){
            int mid = (start+end)/2;
            //value find
            if(nums[mid] == target){
                System.out.println(mid);
                System.exit(0);
            }
            // left sorted array
            if(nums[start] <= nums[mid]){
                //value in left
                if(target>= nums[start] && target <= nums[mid])
                    end = mid-1;
                else
                    start = mid + 1;
            }
            //right sorted array
            else{
                if(target >= nums[mid] && target <= nums[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
    }

}
