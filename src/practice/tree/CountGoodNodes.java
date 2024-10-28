package practice.tree;

import practice.TreeNode;

import static practice.tree.MaximumDepthBinaryTree.printTreeInorder;

public class CountGoodNodes {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        printTreeInorder(root);
        int ans = solve(root, Integer.MIN_VALUE);
        System.out.println(ans);
    }

    public static int solve(TreeNode root, int max) {
        if (root == null) return 0;
        int res = root.val >= max ? 1 : 0;
        res += solve(root.left, Math.max(max, root.val));
        res += solve(root.right, Math.max(max, root.val));
        return res;
    }
}
