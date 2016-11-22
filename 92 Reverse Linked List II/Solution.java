
/**
 Reverse a linked list from position m to n. Do it in-place and in one-pass.

 For example:
 Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 return 1->4->3->2->5->NULL.

 Note:
 Given m, n satisfy the following condition:
 1 ≤ m ≤ n ≤ length of list.
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next==null) return head;
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode res = pre;
        for (int i = 1; i < m; i++) {
            pre = pre.next;
        }
        ListNode p = pre.next;
        for (int i = m; i < n; i++) {
            ListNode tmp = pre.next;
            pre.next = p.next;
            p.next = pre.next.next;
            pre.next.next = tmp;
        }
        return res.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next.next = new ListNode(4);
        a.next.next.next.next = new ListNode(5);

        ListNode res = solution.reverseBetween(a,1,4);

        while (res!=null){
            System.out.println(res.val);
            res=res.next;
        }

    }
}


