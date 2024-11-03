package practice.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximumSubsequenceScore {
    public static void main(String[] args) {
        int[] nums1 = {4, 2, 3, 1, 1};
        int[] nums2 = {7, 5, 10, 9, 6};
        int k = 2;

        int n = nums1.length;
        int[][] pair = new int[n][2];
        for (int i = 0; i < n; i++) {
            pair[i][0] = nums1[i];
            pair[i][1] = nums2[i];
        }

        Arrays.sort(pair, (a, b) -> b[1] - a[1]);

        // for (int i = 0; i < n; i++) {
        //     System.out.println("pair[i][0] = " + pair[i][0] + " -> " + " pair[i][1] " + pair[i][1]);
        // }

        int res = 0, sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(pair[i][0]);
            sum += pair[i][0];
            System.out.println(sum);
            if (pq.size() > k) sum -= pq.poll();
            if (pq.size() == k) res = Math.max(res, sum * pair[i][1]);
        }
        System.out.println(res);

    }
}
