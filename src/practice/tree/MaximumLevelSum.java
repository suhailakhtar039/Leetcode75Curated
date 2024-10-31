package practice.tree;

import practice.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

import static practice.tree.MaximumDepthBinaryTree.printTreeInorder;

public class MaximumLevelSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(11);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(30);
        root.right = new TreeNode(-3);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(11);

        printTreeInorder(root);
        int ans = solve(root);
        System.out.println(ans);
    }

    public static int solve(TreeNode root) {
        if (root == null) return 0;
        int ans = Integer.MIN_VALUE, curLevel = 0, curMxLevel = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            curLevel++;
            int n = queue.size(), sum = 0;
            for (int i = 0; i < n; i++) {
                TreeNode temp = queue.poll();
                sum += temp.val;
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
            }
            if (sum > ans) {
                ans = sum;
                curMxLevel = curLevel;
            }
        }
        return curMxLevel;

    }
}
