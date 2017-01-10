
/**
 Given a binary tree, find the maximum path sum.

 For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path must contain at least one node and does not need to go through the root.

 For example:
 Given the below binary tree,

 1
 / \
 2   3
 Return 6.
 **
 */
public class Solution {
    private int maxvalue = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxvalue;
    }
    public int helper(TreeNode root) {
        if (root == null) return 0;
        int left = Math.max(0,helper(root.left));
        int right = Math.max(0,helper(root.right));

        maxvalue = Math.max(maxvalue, left + right + root.val);
        return Math.max(left,right)+root.val;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

    }
}


