public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rhead = l1;
        ListNode prev = null;
        if(l1==null&&l2==null){
            return null;
        }
        else if(l1==null&&l2!=null){
            return l2;
        }
        else if(l1!=null&&l2==null){
            return l1;
        }
        
        while(l1!=null||l2!=null){
            if(l1==null){
                l1 = new ListNode(0);
                prev.next = l1;
            }
            if(l2==null){
                l2 = new ListNode(0);
            }
            
            l1.val = l1.val+l2.val;
            if(l1.val>9){
                l1.val-=10;
                if(l1.next == null){
                    l1.next = new ListNode(1);
                }
                else{
                    l1.next.val+=1;
                }
            }
            prev = l1;
            l1 = l1.next;
            l2 = l2.next;
        }
        return rhead;
    }
}