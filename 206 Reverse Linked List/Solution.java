
/**
 Reverse a singly linked list.

 click to show more hints.

 Hint:
 A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class Solution {
//    reverse iteratively
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null )
            return head;
        ListNode p = head.next;
        ListNode q = head;
        q.next = null;
        while (p.next!=null){
            ListNode temp = p.next;
            p.next = q;
            q=p;
            p=temp;
        }
        p.next=q;
        return p;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        ListNode res;
        res = solution.reverseList(list);
        System.out.println(res);
        System.out.println(res.val);
        System.out.println(res.next.val);
        System.out.println(res.next.next.val);
    }
}


