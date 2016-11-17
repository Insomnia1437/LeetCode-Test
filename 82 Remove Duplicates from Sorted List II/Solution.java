
/**
 Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

 For example,
 Given 1->2->3->3->4->4->5, return 1->2->5.
 Given 1->1->1->2->3, return 2->3.
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null || head.next==null) return head;
        ListNode newhead = new ListNode(0);
        newhead.next = head;
        ListNode pre = newhead,cur = head;
        while (cur!=null){
            while (cur.next != null && cur.val == cur.next.val){
                cur = cur.next;
            }
            if (pre.next == cur)
                pre = pre.next;
            else {
                pre.next = cur.next;
            }
            cur = cur.next;
        }
        return newhead.next;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next.next = new ListNode(4);
        a.next.next.next.next = new ListNode(4);

        ListNode res = solution.deleteDuplicates(a);
        while (res!=null){
            System.out.println(res.val);
            res=res.next;
        }

    }
}


