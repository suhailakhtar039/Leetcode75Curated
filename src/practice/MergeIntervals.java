package practice;

import java.util.*;

public class MergeIntervals {
    private static int[][] solve(int[][] mergeIntervals){
        Arrays.sort(mergeIntervals, (o1, o2) -> o1[0]-o2[0]);
        List<int[]> res = new ArrayList<>();
        int[] newInterval = mergeIntervals[0];
        for(int i=1; i<mergeIntervals.length; i++){
        //    new interval is less than this interval
            if(newInterval[1] < mergeIntervals[i][0]){
                res.add(newInterval);
                newInterval = mergeIntervals[i];
            }
        //   new interval is overlapping
            else {
                newInterval[0] = Math.min(newInterval[0],mergeIntervals[i][0]);
                newInterval[1] = Math.max(newInterval[1],mergeIntervals[i][1]);
            }
        }
        res.add(newInterval);
        return res.toArray(new int[res.size()][]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mergeIntervals = new int[n][2];
        for(int i=0; i<n; i++){
            mergeIntervals[i][0] = sc.nextInt();
            mergeIntervals[i][1] = sc.nextInt();
        }
        int[][] ans = solve(mergeIntervals);
        for(int []an:ans)
            System.out.println(an[0] + ":" + an[1]);
    }
}
