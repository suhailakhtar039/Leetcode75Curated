public class LongestValidParantheses {
    public static void main(String[] args) {
        String s = "(()";

        int n = s.length();
        int left = 0, right = 0, ans = 0;
        // 1st scan
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(')
                left++;
            else right++;
            if (left == right)
                ans = Math.max(ans, 2 * left);
            if (right > left)
                left = right = 0;
        }

        left = right = 0;
        // 2nd scan
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '(')
                left++;
            else right++;
            if (left == right)
                ans = Math.max(ans, 2 * left);
            if (left > right)
                left = right = 0;
        }

        System.out.println(ans);

    }
}
