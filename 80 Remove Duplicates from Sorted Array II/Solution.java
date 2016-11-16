
/**
 Follow up for "Remove Duplicates":
 What if duplicates are allowed at most twice?

 For example,
 Given sorted array nums = [1,1,1,2,2,3],

 Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.

 Subscribe to see which companies asked this question
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int i = nums.length==0?1:0;
        for (int n:nums){
            if (i<2 || n>nums[i-2])
                nums[i++]=n;
        }
        return i;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[] = {1,1,1,2,2,3};
        System.out.println(solution.removeDuplicates(a));
    }
}


