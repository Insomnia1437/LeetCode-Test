
/**
 Given a list, rotate the list to the right by k places, where k is non-negative.

 For example:
 Given 1->2->3->4->5->NULL and k = 2,
 return 4->5->1->2->3->NULL.
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null || head.next==null|| k==0)return head;
        ListNode res,last=head;
        int len=1;
        while (last.next!=null){
            last=last.next;
            len++;
        }
        last.next = head;
        k=k % len;
        for (int i = 0; i < len-k; i++) {
            last= last.next;
        }
        res = last.next;
        last.next=null;
        return res;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
//        a.next.next = new ListNode(3);
//        a.next.next.next = new ListNode(4);
//        a.next.next.next.next = new ListNode(5);

        ListNode res = solution.rotateRight(a,3);
        while (res!=null){
            System.out.print(res.val+"\t");
            res=res.next;
        }


    }
}


