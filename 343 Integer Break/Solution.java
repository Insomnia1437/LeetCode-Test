import java.util.Arrays;

/**
 Given a positive integer n, break it into the sum of at least two positive integers and maximize the product of those integers. Return the maximum product you can get.

 For example, given n = 2, return 1 (2 = 1 + 1); given n = 10, return 36 (10 = 3 + 3 + 4).

 Note: You may assume that n is not less than 2 and not larger than 58.

 Hint:

 There is a simple O(n) solution to this problem.
 You may check the breaking results of n ranging from 7 to 10 to discover the regularities.
 */
public class Solution {
    public int integerBreak(int n) {
        int res=0;
        if (n==2){
            res = 1;
        }
        else if (n==3) {
            res = 2;
        } else{
            res = DP(n);
        }
        return res;
    }
    private int DP(int n){
        if (n==2 || n==3 || n==4)
            return n;
        else {
            return 3*DP(n-3);
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.integerBreak(58));

    }
}


