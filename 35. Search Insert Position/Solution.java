
/**
 Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

 You may assume no duplicates in the array.

 Here are few examples.
 [1,3,5,6], 5 → 2
 [1,3,5,6], 2 → 1
 [1,3,5,6], 7 → 4
 [1,3,5,6], 0 → 0
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length==0)
            return 0;
        int i=0,j=nums.length-1,mid;
        while (i<=j){
            mid=(j+i)/2;
            if (nums[mid]==target){
                return mid;
            }
            if (i==j){
                return nums[i]>target?(i==0?0:i):i+1;
            }
            if (nums[mid]<target){
                i=mid+1;
            }else {
                j=mid-1;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int t[] = {1,3,5,6};
        System.out.println(solution.searchInsert(t,0));


    }
}


