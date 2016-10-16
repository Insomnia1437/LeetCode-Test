import java.util.*;

/**
 Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newlist = new ListNode(0);
        ListNode p=l1,q=l2,m=newlist;
        while (p!=null && q!=null){
            if (p.val<q.val){
                m.next = new ListNode(p.val);
                p=p.next;
            }else {
                m.next = new ListNode(q.val);
                q=q.next;
            }
            m=m.next;
        }
        if (p!=null){
            m.next=p;
        }
        if (q!=null){
            m.next=q;
        }
        return newlist.next;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode t1 = new ListNode(1);
        t1.next = new ListNode(3);
        t1.next.next = new ListNode(5);

        ListNode t2 = new ListNode(2);
        t2.next = new ListNode(4);
        t2.next.next = new ListNode(6);
        t2.next.next.next = new ListNode(7);

        ListNode res = solution.mergeTwoLists(t1,t2);
        while (res!=null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}


