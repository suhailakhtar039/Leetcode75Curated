package practice.DP;

public class EditDistance {
    public static void main(String[] args) {
        String s1 = "horse", s2 = "ros";

        int n = s1.length(), m = s2.length();
        int[][] table = new int[n + 1][m + 1];

        for(int i = 0; i<=n; i++)
            table[i][0] = i;
        for(int j = 0; j<=m; j++)
            table[0][j] = j;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    table[i][j] = table[i-1][j-1];
                else
                    table[i][j] = 1 + Math.min(table[i-1][j-1], Math.min(table[i-1][j], table[i][j-1]));
            }
        }
        System.out.println(table[n][m]);
    }
}
