package practice.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertIntervals {
    private static int[][] solve(int[][] intervals,int[] newInterval){
        List<int[]> res = new ArrayList<>();
        for(int[] slot : intervals){
            // existing before slot
            if(newInterval[1]<slot[0]){
                res.add(newInterval);
                newInterval = slot;
            }else if(slot[1] < newInterval[0]){
                res.add(slot);
            }else{
                newInterval[0] = Math.min(slot[0],newInterval[0]);
                newInterval[1] = Math.max(slot[1],newInterval[1]);
            }
        }
        res.add(newInterval);
        return  res.toArray(new int[res.size()][]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] interval = new int[n][2];
        for(int i=0; i<n; i++){
            interval[i][0] = sc.nextInt();
            interval[i][1] = sc.nextInt();
        }
        int[] newInterval = new int[2];
        newInterval[0] = sc.nextInt();
        newInterval[1] = sc.nextInt();
        int[][] ans = solve(interval,newInterval);
        for (int[] an : ans) System.out.println(an[0] + ":" + an[1]);
    }
}
