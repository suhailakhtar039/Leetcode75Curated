package practice.tree;

import practice.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> ans = new ArrayList<>();
        queue.add(root);

        while (queue.size() != 0) {
            int n = queue.size();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                TreeNode temp = queue.poll();
                sum += temp.val;
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
            }
            double average = (sum * 1.0) / n;
            ans.add(average);
        }
        System.out.println(ans);
    }
}
