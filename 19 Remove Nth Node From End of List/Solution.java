import java.util.*;

/**
 Given a linked list, remove the nth node from the end of list and return its head.

 For example,

 Given linked list: 1->2->3->4->5, and n = 2.

 After removing the second node from the end, the linked list becomes 1->2->3->5.
 Note:
 Given n will always be valid.
 Try to do this in one pass.
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur=head,pre=head;
        int count=n;
        while (count>0 && cur!=null){
            cur=cur.next;
            count--;
        }
        if (cur==null) {
            return head.next;
        }
        while (cur!=null && cur.next!=null){
            pre=pre.next;
            cur=cur.next;
        }
        pre.next=pre.next.next;
        return head;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode test = new ListNode(1);
        test.next = new ListNode(2);
        test.next.next = new ListNode(3);
        test.next.next.next = new ListNode(4);
        test.next.next.next.next = new ListNode(5);
        System.out.println(solution.removeNthFromEnd(test,2).next.next.val);


    }
}


