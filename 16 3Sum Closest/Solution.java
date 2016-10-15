import java.util.Arrays;
import java.util.List;

/**
 Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

 For example, given array S = {-1 2 1 -4}, and target = 1.

 The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length == 0 || nums.length<3) return 0;
        Arrays.sort(nums);
        int min = nums[0]+nums[1]+nums[2];
        for (int i = 0; i < nums.length-2; i++) {
                int lo = i+1, hi = nums.length-1, sum = target - nums[i];
                while (lo < hi) {
                    if (Math.abs(nums[lo]+nums[hi]+nums[i]-target) < Math.abs(min-target)) {
                        min = nums[i]+nums[lo]+nums[hi];
                    }
                    if (nums[lo] + nums[hi] < sum) lo++;
                    else hi--;
                }
            }
        return min;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int test[] = {1,1,-1,-1,3};
        int res;
        res = solution.threeSumClosest(test,-1);
        System.out.println(res);
    }
}


