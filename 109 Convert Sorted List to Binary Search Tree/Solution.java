
/**
 Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.

 Note:
 You may assume that duplicates do not exist in the tree.
 **
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head==null)
            return null;
        return toBST(head,null);
    }

    public TreeNode toBST(ListNode head, ListNode tail) {
        ListNode fast = head;
        ListNode slow = head;
        if (head == tail) return null;
        while (fast!=tail && fast.next!=tail) {
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode root = new TreeNode(slow.val);

        root.left = toBST(head,slow);
        root.right = toBST(slow.next,tail);
        return root;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();



    }
}


