package practice.tree;

import practice.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static practice.tree.MaximumDepthBinaryTree.printTreeInorder;

public class BinaryTreeRightSide {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        // root.left.left.left = new TreeNode(3);
        // root.left.left.right = new TreeNode(-2);
        root.right = new TreeNode(3);
        // root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(4);
        printTreeInorder(root);
        List<Integer> list = new ArrayList<>();
        int curLevel = 0;
        solve(root, curLevel, list);
        System.out.println(list);
    }
    public static void solve(TreeNode root, int curLevel, List<Integer> list){
        if(root == null)return;
        if(curLevel == list.size()){
            list.add(root.val);
        }
        solve(root.right, curLevel + 1, list);
        solve(root.left, curLevel + 1, list);
    }
}
