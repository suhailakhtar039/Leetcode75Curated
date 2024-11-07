package practice.array;

import java.util.Arrays;

public class CountingBitsAgain {
    public static void main(String[] args) {
        int n = 5;


        int []ans = new int[n+1];
        for(int i = 0; i<=n; i++){
            int res = 0, d = i;
            while(d>0){
                if((d&1) == 1)
                    res++;
                d >>= 1;
            }
            ans[i] = res;
        }

        System.out.println(Arrays.toString(ans));
    }
}
