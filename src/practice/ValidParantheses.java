package practice;

import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        boolean ans = solve("([]{)");
        System.out.println(ans);
    }

    public static char reverse(char c) {
        if (c == ')')
            return '(';
        else if (c == '}')
            return '{';
        else return '[';
    }

    public static boolean solve(String check) {
        int n = check.length();
        boolean ans = false;
        Stack<Character> s = new Stack<>();
        for (Character c : check.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                s.push(c);
            else {
                if (s.size() == 0)
                    return false;
                char original = reverse(c);
                if (s.peek() == original)
                    s.pop();
                else return false;
            }
        }
        return s.size() == 0;
    }
}
