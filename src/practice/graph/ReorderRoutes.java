package practice.graph;

import java.util.ArrayList;

public class ReorderRoutes {
    public static void main(String[] args) {
        int n = 6;
        int[][] connections = {
                {0, 1},
                {0, 3},
                {2, 1},
                {3, 4},
                {5, 4},
        };

        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++)
            g.add(new ArrayList<>());
        for (int[] i : connections) {
            g.get(i[0]).add(i[1]);
            g.get(i[1]).add(-i[0]);
        }

        int ans = solve(g, new boolean[n], 0);
        System.out.println(ans);

    }

    public static int solve(ArrayList<ArrayList<Integer>> g, boolean[] visited, int src) {
        int ans = 0;
        visited[src] = true;
        for (int neighbors : g.get(src))
            if (!visited[Math.abs(neighbors)])
                ans += solve(g, visited, Math.abs(neighbors)) + (neighbors > 0 ? 1 : 0);
        return ans;
        // int change = 0;
        // visited[src] = true;
        // for (int to : g.get(src))
        //     if (!visited[Math.abs(to)])
        //         change += solve(g, visited, Math.abs(to)) + (to > 0 ? 1 : 0);
        // return change;
    }
}
