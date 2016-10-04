
/**
 Say you have an array for which the ith element is the price of a given stock on day i.

 Design an algorithm to find the maximum profit. You may complete at most two transactions.

 Note:
 You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 */
public class Solution {

    public int maxProfit(int[] prices) {
        int len = prices.length;
        int res = 0;
        if (len<=2){
            res = maxProfitOnce(prices,0,len-1);
        }
        int temp;
        for (int i = 1; i < len-1; i++) {
            temp = maxProfitOnce(prices,0,i)+maxProfitOnce(prices,i,len-1);
            if (res<temp){
                res = temp;
            }
            
        }
        return res;
    }
    private int maxProfitOnce(int[] prices,int start,int end){
        int maxPro=0;
        if (end - start >0){
            int low=prices[start];

            for (int i = start+1;i <= end;i++){
                if (prices[i]<low){
                    low=prices[i];
                }else if(prices[i] - low > maxPro){
                    maxPro = prices[i] - low;
                }
            }

        }else
            maxPro = 0;
        return maxPro;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[]={7,1,5,3,6,4};
        System.out.println(solution.maxProfit(a));

    }
}


