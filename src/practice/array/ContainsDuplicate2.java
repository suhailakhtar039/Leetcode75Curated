package practice.array;

import java.util.HashMap;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;

        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            if(map.containsKey(nums[i])){
                if(i - map.get(nums[i]) <= k){
                    System.out.println(true);
                    System.exit(0);
                }
            }
            map.put(nums[i], i);
        }
        System.out.println(false);
    }
}
