
/**
 Say you have an array for which the ith element is the price of a given stock on day i.

 Design an algorithm to find the maximum profit.
 You may complete as many transactions as you like(ie, buy one and sell one share of the stock multiple times).
 However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 */
public class Solution {

    public int maxProfit(int[] prices) {
        if (prices.length<2)
            return 0;
        int res = 0;
        int diff=0;
        for (int i = 1; i < prices.length; i++) {
            diff = prices[i]-prices[i-1];
            if (diff>0)
                res+=diff;
        }
        return res;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[]={1,2,3,8};
        System.out.println(solution.maxProfit(a));

    }
}


