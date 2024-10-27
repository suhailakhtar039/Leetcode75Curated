package practice;

public class MaximumDepthBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        printInorder(root);
        System.out.println();
        int height = maxDepth(root);
        System.out.println(height);
    }

    public static int maxDepth(TreeNode root){
        if(root == null)return 0;
        int ans = 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        return ans;
    }

    public static void printInorder(TreeNode root){
        if(root == null)return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }
}
