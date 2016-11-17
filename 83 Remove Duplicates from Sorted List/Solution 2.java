
/**
 Given a sorted linked list, delete all duplicates such that each element appear only once.

 For example,
 Given 1->1->2, return 1->2.
 Given 1->1->2->3->3, return 1->2->3.
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null || head.next==null) return head;
        ListNode p = head,q = p.next;
        while (q != null){
            if (p.val == q.val){
                p.next = q.next;
            }else
                p = p.next;
            q = q.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode a = new ListNode(1);
        a.next = new ListNode(1);
//        a.next.next = new ListNode(1);
//        a.next.next.next = new ListNode(3);
//        a.next.next.next.next = new ListNode(3);

        ListNode res = solution.deleteDuplicates(a);
        while (res!=null){
            System.out.println(res.val);
            res=res.next;
        }

    }
}


