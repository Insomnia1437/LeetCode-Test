
/**
 Given an integer, write a function to determine if it is a power of three.

 Follow up:
 Could you do it without using any loop / recursion?
 */
public class Solution {
    public boolean isPowerOfThree(int n) {
            double n_d = (double)n;
            while(n_d >= 3){
                n_d = n_d/3.0;
            }
            return n_d == 1.0;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfThree(4));
    }
}


