

/**
 Given an array of non-negative integers, you are initially positioned at the first index of the array.

 Each element in the array represents your maximum jump length at that position.

 Determine if you are able to reach the last index.

 For example:
 A = [2,3,1,1,4], return true.

 A = [3,2,1,0,4], return false.
 */
public class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int last=n-1,i,j;
        for(i=n-2;i>=0;i--){
            if(i+nums[i]>=last)last=i;
        }
        return last<=0;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[]={4,2,0,0,1,1,4,4,4,0,4,0};
        System.out.println(solution.canJump(a));
    }
}


