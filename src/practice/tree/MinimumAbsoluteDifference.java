package practice.tree;

import practice.TreeNode;

public class MinimumAbsoluteDifference {
    static int ans = Integer.MAX_VALUE;
    static TreeNode prev;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);


        solve(root);
        System.out.println(ans);
    }

    public static void solve(TreeNode root) {
        if (root == null) return;
        solve(root.left);
        if (prev != null) {
            ans = Math.min(ans, root.val - prev.val);
        }
        prev = root;
        solve(root.right);
    }
}
