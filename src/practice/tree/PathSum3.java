package practice.tree;

import practice.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static practice.tree.MaximumDepthBinaryTree.printTreeInorder;

public class PathSum3 {
    public static int res = 0;
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

        int target = 8;
        solve(root, 0, target);
    }
    public static void solve(TreeNode root, int sum, int target){
        if(root == null)return;
        if(sum > target) return;
        if(sum == target){
            res++;
            return;
        }
        solve(root.left, sum + root.val, target);
        solve(root.right, sum + root.val, target);
    }
}
