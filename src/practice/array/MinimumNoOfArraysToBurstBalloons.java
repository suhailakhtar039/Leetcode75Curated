package practice.array;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNoOfArraysToBurstBalloons {
    public static void main(String[] args) {
        int[][] points = new int[][]{
                {10, 16},
                {2, 8},
                {1, 6},
                {7, 12}
        };

        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        // for(int[]a : points){
        //     System.out.println(a[0] + ", " + a[1]);
        // }
        int ans = 1, n = points.length;
        int prev = points[0][1];
        for(int i = 1; i<n; i++){
            if(points[i][0] <= prev)continue;
            ans++;
            prev = points[i][1];
        }
        System.out.println(ans);
    }
}
