

/**
 Given an array of integers, every element appears three times except for one, which appears exactly once. Find that single one.

 Note:
 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 **
 */
public class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if (((nums[j] >> i) & 1) == 1) {
                    sum++;
                    sum%=3;
                }
            }
            if (sum != 0)
                ans |= sum << i;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[] = {1,20,1,1};
        System.out.println(solution.singleNumber(a));
    }
}


