import sun.reflect.generics.tree.Tree;

import java.util.Stack;

/**
 Invert a binary tree.

    4
  /    \
 2     7
 / \   / \
 1   3 6   9
 to
 4
 /   \
 7     2
 / \   / \
 9   6 3   1
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        Stack stack = new Stack();
        stack.push(root);
        TreeNode temp=new TreeNode(0);
        TreeNode p =null;

        while (!stack.empty()){
            p= (TreeNode) stack.pop();
            if (p.left!=null)
                stack.push(p.left);
            if (p.right!=null)
                stack.push(p.right);
            temp=p.left;
            p.left = p.right;
            p.right=temp;
        }

        return root;
    }




    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(7);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);
        tree.right.left = new TreeNode(6);
        tree.right.right = new TreeNode(9);


        TreeNode res = s.invertTree(tree);
        System.out.println(res.left.val);
        System.out.println(res.right.val);
        System.out.println(res.right.right.val);

    }
}
