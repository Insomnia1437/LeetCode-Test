import java.util.*;

/**
 Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

 For example:
 Given binary tree [3,9,20,null,null,15,7],
 3
 / \
 9  20
 /  \
 15   7
 return its zigzag level order traversal as:
 [
 [3],
 [20,9],
 [15,7]
 ]
 *
 */
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Deque<TreeNode> dq = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        dq.offer(root);
        boolean forward = true;
        while (!dq.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int levelnum = dq.size();
            for (int i = 0; i < levelnum; i++) {
                TreeNode t = dq.peek();
                if (t.left != null) dq.offer(t.left);
                if (t.right != null) dq.offer(t.right);
                if (forward) {
                    temp.add(dq.poll().val);
                }else {
                    temp.add(0,dq.poll().val);
                }
            }
            res.add(temp);
            forward  = !forward;
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


