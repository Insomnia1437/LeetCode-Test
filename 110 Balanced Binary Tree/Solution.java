import java.util.*;

/**
 Given a binary tree, determine if it is height-balanced.

 For this problem,
 a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 **
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int left = depth(root.left);
        int right = depth(root.right);
        return Math.abs(left-right) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }
    public int depth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(depth(root.left), depth(root.right))+1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode r = new TreeNode(3);
        r.left = new TreeNode(1);
        r.right = new TreeNode(5);


    }
}


