package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class CourseSchedule {
    private static boolean solve(int n,int[][] pre){
        boolean[] vis = new boolean[n];
        boolean[] recStack = new boolean[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++)
            adj.add(new ArrayList<Integer>());
        for (int[] ints : pre) {
            adj.get(ints[1]).add(ints[0]);
        }
        for(int i=0; i<n; i++){
            boolean ans = isCycleUtil(i,adj,vis,recStack);
            if(ans)
                return false;
        }
        return true;
    }

    private static boolean isCycleUtil(int i, ArrayList<ArrayList<Integer>> adj, boolean[] vis, boolean[] recStack) {
        if(recStack[i])
            return true;
        if(vis[i])
            return false;
        vis[i] = true;
        recStack[i] = true;
        for(int neighbor : adj.get(i)){
            if(isCycleUtil(neighbor,adj,vis,recStack))
                return true;
        }
        recStack[i] = false;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] pre = new int[m][2];
        for(int i=0; i<m; i++){
            pre[i][0] = sc.nextInt();
            pre[i][1] = sc.nextInt();
        }
        System.out.println(solve(n,pre));
    }
}
