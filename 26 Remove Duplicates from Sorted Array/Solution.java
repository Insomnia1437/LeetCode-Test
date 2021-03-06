import java.util.*;

/**
 Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 For example,
 Given input array nums = [1,1,2],

 Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 It doesn't matter what you leave beyond the new length.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int i=nums.length>0?1:0;
        for (int n:nums){
            if (n>nums[i-1]){
                nums[i++] = n;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int t[] = {1,2};
        System.out.println(solution.removeDuplicates(t));
        System.out.println(t[0]+" "+t[1]+" ");
    }
}


