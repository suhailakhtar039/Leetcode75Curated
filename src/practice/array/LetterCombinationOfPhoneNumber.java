package practice.array;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhoneNumber {
    static String[] res = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        String digits = "789";

        StringBuilder sb = new StringBuilder("");
        List<String> ans = new ArrayList<>();
        solve(digits, 0, sb, ans);
        System.out.println(ans);
    }

    public static void solve(String digits, int idx, StringBuilder sb, List<String> ans) {
        if (sb.length() >= digits.length()) {
            ans.add(sb.toString());
            return;
        }
        for (int i = 0; i < res[digits.charAt(idx) - '0'].length(); i++) {
            sb.append(res[digits.charAt(idx) - '0'].charAt(i));
            solve(digits, idx + 1, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
