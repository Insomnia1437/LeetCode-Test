import java.util.*;

/**
 Given a binary tree, return the inorder traversal of its nodes' values.

 For example:
 Given binary tree [1,null,2,3],
 1
 \
  2
 /
 3
 return [1,3,2].

 Note: Recursive solution is trivial, could you do it iteratively?
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null)
            return res;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p=root;
        while (p!=null || !stack.empty()){
            if (p!=null ){
                stack.push(p);
                p=p.left;
            }else {
                p=stack.pop();
                res.add(p.val);
                p=p.right;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode a = new TreeNode(1);
        a.right = new TreeNode(2);
        a.right.left = new TreeNode(3);

        List<Integer> list = new LinkedList<>();
        list = solution.inorderTraversal(a);
        System.out.println(list);
    }
}


