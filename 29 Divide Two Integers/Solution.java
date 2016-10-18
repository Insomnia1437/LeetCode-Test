import java.util.*;

/**
 Divide two integers without using multiplication, division and mod operator.

 If it is overflow, return MAX_INT.
 */
public class Solution {
    public int divide(int dividend, int divisor) {
        int res=0;
        if (divisor==0 || (dividend==Integer.MIN_VALUE && divisor==-1)) return Integer.MAX_VALUE;
        int sign = (dividend<0)^(divisor<0)?-1:1;
        long de=dividend;
        long ds=divisor;
        de=Math.abs(de);
        ds=Math.abs(ds);
        while (de >= ds) {
            long temp = ds, multiple = 1;
            while (de >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            de -= temp;
            res += multiple;
        }
        return sign==1?res:-res;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.divide(15,2));
//        System.out.println(true^false);
    }
}


