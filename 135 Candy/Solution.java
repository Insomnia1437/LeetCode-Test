

/**
 There are N children standing in a line. Each child is assigned a rating value.

 You are giving candies to these children subjected to the following requirements:

 Each child must have at least one candy.
 Children with a higher rating get more candies than their neighbors.
 What is the minimum candies you must give?
 **
 */
public class Solution {
    public int candy(int[] ratings) {
        if (ratings.length<=1) return ratings.length;
        int len = ratings.length;
        int candy[] = new int[len];

        candy[0] = 1;
        for (int i = 1; i < len; i++) {
            if (ratings[i-1]<ratings[i]) {
                candy[i] = candy[i-1]+1;
            }
            else
                candy[i] = 1;
        }
        int sum = candy[len-1];
        for (int i = len-2; i >= 0; i--) {
            if (ratings[i+1]<ratings[i]) {
                candy[i] = Math.max(candy[i],candy[i+1]+1);
            }
            sum+=candy[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int rate[] = {1,2,3,4,5,4,3,2,1};
        System.out.println(solution.candy(rate));

    }
}


