import java.util.Stack;

/**
 Two elements of a binary search tree (BST) are swapped by mistake.

 Recover the tree without changing its structure.

 Note:
 A solution using O(n) space is pretty straight forward. Could you devise a constant space solution?
 *
 */
public class Solution {
    public void recoverTree(TreeNode root) {
        TreeNode temp = root, pre = null;
        Stack<TreeNode> st = new Stack<>();
        TreeNode first = null,second = null;
        while (!st.empty() || temp != null){
            while (temp!= null) {
                st.add(temp);
                temp = temp.left;
            }
            temp = st.pop();
//            System.out.println(temp.val);
            if (pre != null && pre.val >= temp.val) {
                if (first == null) {
                    first = pre;
                    second = temp;
                }
                else {
                    second = temp;
                }
            }
            pre = temp;
            temp=temp.right;
        }
        int t = first.val;
        first.val = second.val;
        second.val = t;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode r = new TreeNode(0);
        r.left = new TreeNode(1);
//        r.right = new TreeNode(1);
        solution.recoverTree(r);

        System.out.println(r.left.val);

    }
}


