package practice.array;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    public static void main(String[] args) {
        int k = 2, n = 7;


        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        solve(ans, comb, 1, k, n);
        System.out.println(ans);
    }

    public static void solve(List<List<Integer>> ans, List<Integer> comb, int start, int k, int n)
    {
        if(comb.size() == k && n == 0){
            ans.add(new ArrayList<>(comb));
            return;
        }
        for(int i = start; i<=9; i++){
            comb.add(i);
            solve(ans, comb, i+1, k, n-i);
            comb.remove(comb.size()-1);
        }
    }
}
