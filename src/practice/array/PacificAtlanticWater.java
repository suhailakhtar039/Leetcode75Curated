package practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PacificAtlanticWater {
    private static int[] dx = {-1 , 1 , 0 , 0};
    private static int[] dy = {0 , 0 , -1 , 1};
    private static void dfs(int[][] arr,boolean[][] sea,int i,int j){
        int n = arr.length;
        int m = arr[0].length;
        if(i<0 || i>n || j<0 || j>m)return;
        for(int k=0; k<4; k++){
            int x = i + dx[k];
            int y = j + dy[k];
            // System.out.println("inside loop i = "+ i + " j = " + j);
            // System.out.println("inside loop x = "+ x + " y = " + y);
            if(x>=0 && x<n && y>=0 && y<m && !sea[x][y]){
                // System.out.println("inside if x = "+ x + " y = " + y);
                if(arr[x][y]>=arr[i][j]){
                    // System.out.println("x = " + x + " y = " + y);
                    sea[x][y] = true;
                    dfs(arr,sea,x,y);
                }
            }
        }
    }
    private static List<List<Integer>> solve(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        List<List<Integer>> ans = new ArrayList<>();
        boolean[][] blue = new boolean[n][m];
        boolean[][] red = new boolean[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++)
                blue[i][j] = red[i][j] = false;
        }
        for(int i=0; i<n; i++){
            blue[i][0] = true;
            red[i][m-1] = true;
        }
        for(int j=0; j<m; j++){
            blue[0][j] = true;
            red[n-1][j] = true;
        }
        for(int i=0; i<n; i++)
            dfs(arr,blue,i,0);
        for(int j=0; j<m; j++)
            dfs(arr,blue,0,j);

        for(int i=0; i<n; i++)
            dfs(arr,red,i,m-1);
        for(int j=0; j<m; j++)
            dfs(arr,red,n-1,j);
        // System.out.println("blue");
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.print(blue[i][j]?1:0);
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }
        //
        // System.out.println("red");
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.print(red[i][j]?1:0);
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(blue[i][j] && red[i][j]){
                    ans.add(List.of(i,j));
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                arr[i][j] = sc.nextInt();
        System.out.println(solve(arr));
    }
}
