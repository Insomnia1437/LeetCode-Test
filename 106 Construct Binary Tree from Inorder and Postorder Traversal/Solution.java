
/**
 Given inorder and postorder traversal of a tree, construct the binary tree.

 Note:
 You may assume that duplicates do not exist in the tree.
 **
 */
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(postorder.length-1, 0, inorder.length-1, inorder, postorder);
    }

    public TreeNode helper(int post, int instart, int inend, int inorder[], int postorder[]){
        if (post < 0 || instart > inend){
            return null;
        }
        TreeNode root = new TreeNode(postorder[post]);
        int inIndex = 0;
        for (int i = instart; i <= inend; i++) {
            if (inorder[i] == root.val){
                inIndex = i;
                break;
            }
        }
        root.left = helper(post-1-inend+inIndex, instart, inIndex-1, inorder, postorder);
        root.right = helper(post-1, inIndex+1, inend, inorder, postorder);
        return root;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();



    }
}


