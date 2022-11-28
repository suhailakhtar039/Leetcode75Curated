package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    private static int solve(int[] arr){
        int ans = 0;
        Map<Integer,Integer> m = new HashMap<>();
        for(int x:arr){
            if(!m.containsKey(x)){
                int left = m.containsKey(x-1)?m.get(x-1):0;
                int right = m.containsKey(x+1)?m.get(x+1):0;
                int len = left + right +1;
                m.put(x,len);
                ans = Math.max(ans,len);
                m.put(x-left,len);
                m.put(x+right,len);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(solve(arr));
    }
}
