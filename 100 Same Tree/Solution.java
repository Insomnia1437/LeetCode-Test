import java.util.*;

/**
 Given two binary trees, write a function to check if they are equal or not.

 Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */
public class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if (p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }




    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode a = new TreeNode(1);
//        a.left = new TreeNode(3);
        a.right = new TreeNode(2);
//        a.left.right = new TreeNode(4);

        TreeNode b = new TreeNode(1);
//        b.left = new TreeNode(3);
        b.right = new TreeNode(2);
//        b.left.right = new TreeNode(4);

        System.out.println(solution.isSameTree(a,b));

    }
}


