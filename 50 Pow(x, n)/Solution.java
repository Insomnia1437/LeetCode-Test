import java.util.*;

/**
 Implement pow(x, n).

 */
public class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) return 1 / myPow(x, - (n + 1)) / x;
        double t = myPow(x, n >> 1);
        return ((n & 1) == 1 ? x : 1) * t * t;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myPow(2,-3));
    }
}


