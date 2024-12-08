package practice.array;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        int n = 5, k = 2;

        List<List<Integer>> ans = new ArrayList<>();
        solve(ans, new ArrayList<>(), 1, n, k);
        System.out.println(ans);
    }

    public static void solve(List<List<Integer>> combs, ArrayList<Integer> comb, int start, int n, int k) {
        if (k == 0) {
            combs.add(new ArrayList<>(comb));
            return;
        }
        for (int i = start; i <= n; i++) {
            comb.add(i);
            solve(combs, comb, i + 1, n, k - 1);
            comb.remove(comb.size() - 1);
        }
    }
}
