import java.util.Arrays;

/**
 Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

 For example,
 Given nums = [0, 1, 3] return 2.

 Note:
 Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */
public class Solution {
    public int missingNumber1(int[] nums) {
        int tar=0;
        if (nums.length<1)
            return tar;
        Arrays.sort(nums);
        if (nums[0]!=0){
            return nums[0]-1;
        }
        for (int i = 0; i < nums.length-1; i++) {
            if (((nums[i]+1)^nums[i+1]) != 0){
                tar = nums[i]+1;
                return tar;
            }
        }
        tar = nums[nums.length-1]+1;
        return tar;
    }

    public int missingNumber2(int[] nums){//XOR
        int res=0;
        for (int i = 0; i < nums.length; i++) {
            res^=nums[i];
            res^=(i+1);
        }
        return res;
    }
    public int missingNumber3(int[] nums) { //sum
        int len = nums.length;
        int sum = (0+len)*(len+1)/2;
        for(int i=0; i<len; i++)
            sum-=nums[i];
        return sum;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[] = {1,3,0};
        System.out.println(solution.missingNumber1(a));
//        System.out.println(0^1^2^3^1^3^0);
    }
}


