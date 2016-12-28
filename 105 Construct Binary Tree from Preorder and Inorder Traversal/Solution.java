
/**
 Given preorder and inorder traversal of a tree, construct the binary tree.

 Note:
 You may assume that duplicates do not exist in the tree.
 **
 */
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, 0, inorder.length-1, preorder, inorder);
    }

    public TreeNode helper(int pre, int instart, int inend, int preorder[], int inorder[]){
        if (pre > preorder.length-1 || instart > inend){
            return null;
        }
        TreeNode root = new TreeNode(preorder[pre]);
        int inIndex = 0;
        for (int i = instart; i <= inend; i++) {
            if (inorder[i] == root.val)
                inIndex = i;
        }
        root.left = helper(pre+1, instart, inIndex-1, preorder, inorder);
        root.right = helper(inIndex-instart+pre+1, inIndex+1, inend, preorder, inorder);
        return root;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();



    }
}


