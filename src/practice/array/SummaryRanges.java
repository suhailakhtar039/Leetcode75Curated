package practice.array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 7};

        int n = nums.length;
        int i = 0, j = 0;
        List<String> ans = new ArrayList<>();
        while (i < n) {
            String temp = "";
            j = i + 1;
            while (j < n && nums[j - 1] + 1 == nums[j]) j++;
            int total = j - i;
            if (total == 1) {
                temp += nums[i];
            } else {
                temp += nums[i];
                temp += "->";
                temp += nums[j - 1];
            }
            ans.add(temp);
            i = j;
        }
        System.out.println(ans);
    }
}
