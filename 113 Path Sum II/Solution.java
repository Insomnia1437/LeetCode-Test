import java.util.ArrayList;
import java.util.List;

/**
 Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

 For example:
 Given the below binary tree and sum = 22,
 5
 / \
 4   8
 /   / \
 11  13  4
 /  \    / \
 7    2  5   1
 return
 [
 [5,4,11,2],
 [5,8,4,5]
 ]
 **
 */
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtracking(root,sum,temp,res);
        return res;
    }
    public void backtracking(TreeNode root, int sum, List<Integer> temp, List<List<Integer>> res) {
        if (root == null)
            return;
        temp.add(root.val);

        if (root.val == sum && root.left == null && root.right == null){
            res.add(new ArrayList<>(temp));
        }
        else{
            backtracking(root.left,sum-root.val,temp,res);
            backtracking(root.right,sum-root.val,temp,res);
        }
        temp.remove(temp.size()-1);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();



    }
}


