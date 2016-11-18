
/**
 Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

 You should preserve the original relative order of the nodes in each of the two partitions.

 For example,
 Given 1->4->3->2->5->2 and x = 3,
 return 1->2->2->4->3->5.
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head==null || head.next==null) return head;
        ListNode newhead1 = new ListNode(0);
        ListNode newhead2 = new ListNode(0);
        ListNode p1 = newhead1;
        ListNode p2 = newhead2;
        ListNode cur = head;
        while (cur!=null){
            if (cur.val<x){
                newhead1.next = cur;
                newhead1 = newhead1.next;
            }else {
                newhead2.next = cur;
                newhead2 = newhead2.next;
            }
            cur = cur.next;
        }
        newhead2.next = null;
        newhead1.next = p2.next;
        return p1.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode a = new ListNode(1);
        a.next = new ListNode(4);
        a.next.next = new ListNode(3);
        a.next.next.next = new ListNode(2);
        a.next.next.next.next = new ListNode(5);
        a.next.next.next.next.next = new ListNode(2);

        ListNode res = solution.partition(a,3);
        while (res!=null){
            System.out.println(res.val);
            res=res.next;
        }

    }
}


