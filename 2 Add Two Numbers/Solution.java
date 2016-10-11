
/**
 * You are given two linked lists representing two non-negative numbers.
 * The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head,temp;
        int carry = 0;
        int sum = 0,remainder = 0;
        head = temp = new ListNode(0);
        while (l1!=null || l2!=null || carry!=0){
            sum = (l1==null?0:l1.val)+(l2==null?0:l2.val)+carry;
            carry = sum/10;
            remainder = sum%10;
            temp = temp.next = new ListNode(remainder);
            l1 = l1!=null?l1.next:null;
            l2 = l2!=null?l2.next:null;
        }
        return head.next;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(8);
//        l1.next.next = new ListNode(3);
//        l1.next.next.next = new ListNode(1);

        ListNode l2 = new ListNode(0);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);
//        l2.next.next.next = new ListNode(1);

        ListNode res;
        res = solution.addTwoNumbers(l1,l2);
        System.out.println(res.val);
        System.out.println(res.next.val);


    }
}


