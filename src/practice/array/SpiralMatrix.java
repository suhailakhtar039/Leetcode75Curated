package practice.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {
    private static List<Integer> solve(int[][] v){
        int n = v.length;
        List<Integer> ans = new ArrayList<>();
        if(n == 0)return ans;
        int m = v[0].length;
        int up = 0, left = 0, down = n-1, right = m-1;
        while(up<=down && left<=right){
            for(int i=left; i<=right; i++)
                ans.add(v[up][i]);
            up++;
            if(up>down || left>right)break;
            for(int i=up; i<=down; i++)
                ans.add(v[i][right]);
            right--;
            if(up>down || left>right)break;
            for(int i=right; i>=left; i--)
                ans.add(v[down][i]);
            down--;
            if(up>down || left>right)break;
            for(int i=down; i>=up; i--)
                ans.add(v[i][left]);
            left++;
            if(up>down || left>right)break;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] a = new int[n][m];
        for(int i =0; i<n; i++)
            for(int j=0; j<m; j++)
                a[i][j] = sc.nextInt();
        for(int i : solve(a))
            System.out.print(i);
    }
}
