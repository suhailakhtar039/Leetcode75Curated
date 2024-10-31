package practice.tree;

import practice.TreeNode;

public class DeleteNode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);

        root = solve(root, 7);
    }
    public static TreeNode solve(TreeNode root, int key){
        if(root == null)return null;
        if(key < root.val)solve(root.left, key);
        else if(key > root.val)solve(root.right, key);
        else{
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;
            TreeNode mnNode = findMin(root.right);
            root.val = mnNode.val;
            root.right = solve(root.right, root.val);
        }
        return root;
    }

    public static TreeNode findMin(TreeNode root){
        if(root == null || root.left == null)return null;
        while(root.left != null)root = root.left;
        return root;
    }
}
