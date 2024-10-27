package practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class NonOverlappingIntervals {
    private static int solve(int[][] intervals){
        int n = intervals.length;
        Arrays.sort(intervals,(a1,a2)->a1[1]-a2[1]);
        int ans = 1;
        int end = intervals[0][1];
        for(int i=1; i<n; i++){
            if(intervals[i][0]>=end){
                ans++;
                end = intervals[i][1];
            }
        }
        return n-ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        for(int i=0; i<n; i++){
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        System.out.println(solve(intervals));
    }
}
