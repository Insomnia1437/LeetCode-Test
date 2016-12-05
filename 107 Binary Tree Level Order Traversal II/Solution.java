import java.util.*;

/**
 Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

 For example:
 Given binary tree [3,9,20,null,null,15,7],
 3
 / \
 9  20
 /  \
 15   7
 return its bottom-up level order traversal as:
 [
 [15,7],
 [9,20],
 [3]
 ]
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Deque<TreeNode> dq = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        dq.offer(root);
        while (!dq.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int levelnum = dq.size();
            for (int i = 0; i < levelnum; i++) {
                TreeNode t = dq.peek();
                if (t.left != null) dq.offer(t.left);
                if (t.right != null) dq.offer(t.right);
                temp.add(dq.poll().val);
            }
            res.add(0,temp);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode r = new TreeNode(3);
        r.left = new TreeNode(1);
        r.right = new TreeNode(5);


    }
}


