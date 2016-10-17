import java.util.*;

/**
 Given a linked list, swap every two adjacent nodes and return its head.

 For example,
 Given 1->2->3->4, you should return the list as 2->1->4->3.

 Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head==null || head.next==null) return head;
        ListNode first = new ListNode(0);
        ListNode p=head,q=p.next,temp=first;
        while (p!=null && q!=null){
            temp.next=q;
            p.next = q.next;
            q.next = p;
            temp = p;
            if (p.next!=null){
                p=p.next;
                q=p.next;
            }else break;
        }
        return first.next;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode t = new ListNode(1);
        t.next = new ListNode(2);
        ListNode res = solution.swapPairs(t);
        while (res!=null){
            System.out.println(res.val);
            res = res.next;
        }

    }
}


