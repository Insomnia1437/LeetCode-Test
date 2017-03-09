import java.util.HashMap;
import java.util.Map;

/**
 There are N children standing in a line. Each child is assigned a rating value.

 You are giving candies to these children subjected to the following requirements:

 Each child must have at least one candy.
 Children with a higher rating get more candies than their neighbors.
 What is the minimum candies you must give?
 **
 */
class RandomListNode {
    int label;
    RandomListNode next,random;
    RandomListNode(int x) {this.label = x;}
}
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode p = head,node;
        while (p != null) {
            node = p.next;
            RandomListNode newnode = new RandomListNode(p.label);
            p.next = newnode;
            newnode.next = node;
             p = node;
        }
        p = head;
        while (p != null) {
            if (p.random != null) {
                p.next.random = p.random.next;
            }
            p = p.next.next;
        }
        p = head;
        RandomListNode pseudoHead = new RandomListNode(0);
        RandomListNode copy,copyiter = pseudoHead;
        while (p != null) {
            node = p.next.next;

            copy = p.next;
            copyiter.next = copy;
            copyiter = copy;

            p.next = node;

            p = node;
        }
        return pseudoHead.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

    }

}

