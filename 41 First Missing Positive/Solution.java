import java.util.Arrays;

/**
 Given an unsorted integer array, find the first missing positive integer.

 For example,
 Given [1,2,0] return 3,
 and [3,4,-1,1] return 2.

 Your algorithm should run in O(n) time and uses constant space.
 */
public class Solution {
    public int firstMissingPositive(int[] nums) {
        int res=1;
        if (nums==null)return res;
        Arrays.sort(nums);
        int first=1,temp=0;
        for (int i:nums){
            if (i<=0)continue;
            temp=i;
            if (temp>first){
                return first;
            }
            else {
                first=temp+1;
            }
        }
        res=temp+1;
        return res;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int t[] = {2};
        System.out.println(solution.firstMissingPositive(t));

    }
}


