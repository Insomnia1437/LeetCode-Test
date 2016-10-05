import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 Given an array of integers, find if the array contains any duplicates.
 Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean res = false;
        Set<Integer> set = new HashSet<>();
        for (int i:nums){
            if (!set.add(i)){
                res = true;
            }
        }
        return res;
    }
/*
Another methon using sort
public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) return true;
        }
        return false;
    }
 */

    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[] = {1,2,3,4,6,2,8};
        System.out.println(solution.containsDuplicate(a));

    }
}


