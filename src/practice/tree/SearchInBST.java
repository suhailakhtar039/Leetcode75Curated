package practice.tree;

import practice.TreeNode;

import static practice.tree.MaximumDepthBinaryTree.printTreeInorder;

public class SearchInBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);

        TreeNode ans = solve(root, 7, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(ans.val);

        printTreeInorder(ans);
    }

    public static TreeNode solve(TreeNode root, int target, int a, int b){
        if(root == null)return null;
        if(root.val == target)return root;
        if(root.val > target){
            return solve(root.left, target, a, root.val);
        }
        return solve(root.right, target, root.val, b);
    }

}
