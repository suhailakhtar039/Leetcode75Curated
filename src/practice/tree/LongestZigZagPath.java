package practice.tree;

import practice.TreeNode;

import static practice.tree.MaximumDepthBinaryTree.printTreeInorder;

public class LongestZigZagPath {
    static int max = 0;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.right = new TreeNode(-3);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(11);
        printTreeInorder(root);
        solve(root.right, true, 1);
        solve(root.left, false, 1);
        System.out.println(max);
    }
    public static void solve(TreeNode root, boolean left, int ans){
        if(root == null)return;
        max = Math.max(max, ans);
        // System.out.println("ans = " + ans);
        if(left){
            solve(root.left, false, ans + 1);
            solve(root.right, true,  1);
        }else{
            solve(root.right, true, 1+ans);
            solve(root.left, false, 1);
        }
    }
}
