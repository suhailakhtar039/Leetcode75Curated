package practice.tree;

import practice.TreeNode;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.right = new TreeNode(-3);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(11);

        TreeNode res = solve(root, root.left.left.left, root.left.left.right);
        System.out.println(res.val);
    }

    public static TreeNode solve(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return root;
        if (root.val == p.val || root.val == q.val)
            return root;
        TreeNode left = solve(root.left, p, q);
        TreeNode right = solve(root.right, p, q);
        if (left != null && right != null)
            return root;
        return left == null ? right : left;
    }
}
