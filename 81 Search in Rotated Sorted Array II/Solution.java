
/**
 Follow up for "Search in Rotated Sorted Array":
 What if duplicates are allowed?

 Would this affect the run-time complexity? How and why?

 Write a function to determine if a given target is in the array.
 */
public class Solution {
    public boolean search(int[] nums, int target) {
        int pivot=-1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]>nums[i+1]){
                pivot = i;
                break;
            }
        }
        int lo,hi;
        if (target>=nums[0] && pivot!=-1){
            lo=0;
            hi=pivot;
        }else {
            lo=pivot+1;
            hi=nums.length-1;
        }
        while (lo<=hi){
            int mid = lo+(hi-lo)/2;
            if (nums[mid]==target){
                return true;
            }
            else if (nums[mid]>target)
                hi=mid-1;
            else
                lo=mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[] = {1};
        System.out.println(solution.search(a,0));

    }
}


