package practice.tree;

import practice.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static practice.tree.MaximumDepthBinaryTree.printTreeInorder;

public class LeafSimilarTrees {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        printTreeInorder(root);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        solve(root, list1);
        solve(root, list2);


        System.out.println(list1);
        System.out.println(list2);
        for(int i = 0; i<list1.size() && i < list2.size(); i++){
            if(!Objects.equals(list1.get(i), list2.get(i))){
                System.out.println("inside if with i = " + i + " list1 = " + list1.get(i) + " list2 = " + list2.get(i));
                System.out.println(false);
                System.exit(0);
            }
        }
        System.out.println(true);

    }
    public static void solve(TreeNode root, List<Integer> list){
        if(root == null)return;
        if(root.left == null && root.right == null){
            list.add(root.val);
            return;
        }
        solve(root.left, list);
        solve(root.right, list);
    }
}
