
/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Subscribe to see which companies asked this question
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int a[] = {2, 3, 2, 4, 4, 3, 1};
        int res = s.singleNumber(a);
        System.out.println(res);
    }
}
