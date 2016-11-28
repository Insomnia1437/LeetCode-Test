import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

 For example, given the following triangle
 [
 [2],
 [3,4],
 [6,5,7],
 [4,1,8,3]
 ]
 The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).

 Note:
 Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.
 */
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        if (len<1) return 0;
        int dp[] = new int[len];
        int min=Integer.MAX_VALUE;
        dp[0] = triangle.get(0).get(0);
        for (int i = 1; i < len; i++) {
            List<Integer> temp = triangle.get(i);
            dp[i] = temp.get(i) + dp[i-1];
            for (int j = i-1; j > 0; j--) {
                dp[j] = temp.get(j) + Math.min(dp[j],dp[j-1]);
            }
            dp[0] += temp.get(0);
        }
        for (int i = 0; i < len; i++) {
            min = Math.min(dp[i],min);
        }
        return min;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> a = new ArrayList<>();
        a.add(-1);
        List<Integer> b = new ArrayList<>();
        b.add(2);b.add(3);
        List<Integer> c = new ArrayList<>();
        c.add(1);c.add(-1);c.add(-3);
//        List<Integer> d = new ArrayList<>();
//        d.add(4);d.add(1);d.add(8);d.add(3);

        List<List<Integer>> t = new ArrayList<>();
        t.add(a);t.add(b);t.add(c);//t.add(d);

        System.out.println(solution.minimumTotal(t));

    }
}


