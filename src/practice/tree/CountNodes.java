package practice.tree;

import practice.TreeNode;

public class CountNodes {
    static int sum = 0;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        solve(root);
        System.out.println(sum);
    }
    public static void solve(TreeNode root){
        if(root == null)return;
        sum++;
        solve(root.left);
        solve(root.right);
    }
}
