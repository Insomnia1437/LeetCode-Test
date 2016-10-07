import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 Given a binary tree, return the preorder traversal of its nodes' values.

 For example:
 Given binary tree {1,#,2,3},
 1
 \
 2
 /
 3
 return [1,2,3].
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new LinkedList<>();
        if (root == null)
            return res;
        TreeNode p;
        stack.push(root);
        while (stack.empty() == false){
            p=stack.peek();
            res.add(stack.pop().val);
            if (p.right!=null){
                stack.push(p.right);
            }
            if(p.left!=null){
                stack.push(p.left);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode a = new TreeNode(3);
        a.left = new TreeNode(1);
        a.right = new TreeNode(2);
//        a.right.left = new TreeNode(3);
        List<Integer> res;
        res = solution.preorderTraversal(a);
        System.out.println(res);
    }
}


