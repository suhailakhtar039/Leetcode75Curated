package practice;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int n = 3;
        List<String> ans = generate(n);
        System.out.println(ans);
    }
    public static List<String> generate(int n){
        int open = 0, close = 0;
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        foo(ans, sb, 0, 0, n);
        return ans;
    }
    public static void foo(List<String> ans, StringBuilder sb, int open, int close, int n){
        if(close == n){
            ans.add(sb.toString());
            return;
        }
        if(open < n){
            foo(ans, sb.append("("), open+1, close, n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(open > close){
            foo(ans, sb.append(")"), open, close+1, n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
