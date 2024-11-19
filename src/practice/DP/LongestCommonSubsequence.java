package practice.DP;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";

        int n = s1.length();
        int m = s2.length();
        int[][] ans = new int[n+1][m+1];
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    ans[i][j] = 1 + ans[i-1][j-1];
                else ans[i][j] = Math.max(ans[i-1][j], ans[i][j-1]);
            }
        }
        System.out.println(ans[n][m]);
    }
}
