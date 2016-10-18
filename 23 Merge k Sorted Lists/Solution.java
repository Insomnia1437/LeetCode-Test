import java.util.*;

/**
 Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists==null || lists.length==0) return null;
        return merge(lists,0,lists.length-1);
    }
    public ListNode merge(ListNode[] lists,int left,int right){
        if (left==right) return lists[left];
        int mid = left+(right-left)/2;
        ListNode l = merge(lists,left,mid);
        ListNode r = merge(lists,mid+1,right);
        return mergeTwoLists(l,r);
    }
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if (l1==null)return l2;
        if (l2==null)return l1;
        if (l1.val<l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode a = new ListNode(1);
        a.next = new ListNode(3);
        a.next.next = new ListNode(5);

        ListNode b = new ListNode(2);
        b.next = new ListNode(4);
        b.next.next = new ListNode(6);

        ListNode test[]={a,b};
        ListNode res = solution.mergeKLists(test);
        while (res!=null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}


