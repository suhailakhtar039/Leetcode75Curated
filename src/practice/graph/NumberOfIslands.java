package practice.graph;

import java.util.Scanner;

public class NumberOfIslands {
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    private static boolean isSafe(char[][] grid, int i, int j) {
        int n = grid.length;
        int m = grid[0].length;
        return i >= 0 && i < n && j >= 0 && j < m && grid[i][j] == '1';
    }

    private static void dfs(char[][] grid, boolean[][] vis, int i, int j) {
        if (vis[i][j]) return;
        vis[i][j] = true;
        for (int k = 0; k < 4; k++) {
            int x = i + dx[k], y = j + dy[k];
            if (isSafe(grid, x, y) && !vis[x][y])
                dfs(grid, vis, x, y);
        }
    }

    private static int solve(char[][] grid) {
        int n = grid.length;
        if (n == 0) return 0;
        int m = grid[0].length;
        int ans = 0;
        boolean[][] vis = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    if (!vis[i][j]) {
                        ans++;
                        dfs(grid, vis, i, j);
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.next().charAt(0);
        //    printing the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }

        System.out.println(solve(grid));
    }
}
