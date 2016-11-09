
/**
 Suppose a sorted array is rotated at some pivot unknown to you beforehand.

 (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

 You are given a target value to search. If found in the array return its index, otherwise return -1.

 You may assume no duplicate exists in the array.
 */
public class Solution {
    public int search(int[] nums, int target) {
        int idx=-1;
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
                idx=mid;
                break;
            }
            else if (nums[mid]>target)
                hi=mid-1;
            else
                lo=mid+1;
        }
        return idx;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int a[]={4,2,0,0,1,1,4,4,4,0,4,0};
        int a[]={3,4,7,8,0,1,2};
        System.out.println(solution.search(a,1));
    }
}


