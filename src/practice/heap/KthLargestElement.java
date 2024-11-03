package practice.heap;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 3;


        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = nums.length;
        for(int i =0; i<k; i++)pq.add(nums[i]);
        for(int i = k; i<n; i++){
            pq.add(nums[i]);
            pq.poll();
        }
        System.out.println(pq.peek());

    }
}
