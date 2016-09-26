import java.util.Random;

/**
 Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.

 Follow up:
 What if the linked list is extremely large and its length is unknown to you? Could you solve this efficiently without using extra space?

 Example:

 // Init a singly linked list [1,2,3].
 ListNode head = new ListNode(1);
 head.next = new ListNode(2);
 head.next.next = new ListNode(3);
 Solution solution = new Solution(head);

 // getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.
 solution.getRandom();
 */
public class Solution {
    ListNode head;
    public Solution(ListNode head){
        this.head=head;
    }
    public int getRandom(){
        int k=1;
        Random ran = new Random();
        ListNode p;
        p=head;
        double prob;
        int i=k+1,temp;
        while (p!=null){
            prob = ran.nextDouble()*i;
            //System.out.println(prob);
            if (prob < k){
                temp = head.val;
                head.val = p.val;
                p.val = temp;
            }
            p=p.next;
            i++;
        }
        return head.val;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Solution solution = new Solution(head);
        System.out.println(solution.getRandom());

    }
}
